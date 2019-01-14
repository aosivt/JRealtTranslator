package su.kww.realttranslator.translators.service.yandex;

import io.reactivex.Observable;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import su.kww.realttranslator.core.api.inside.database.entities.AdvertSite;
import su.kww.realttranslator.core.api.remote.domstor.DaggerDomstorComponent;
import su.kww.realttranslator.core.api.remote.domstor.DomstorUsernamePassword;
import su.kww.realttranslator.core.api.remote.domstor.UserNamePassword;
import su.kww.realttranslator.core.api.remote.domstor.entities.options_domstor_data.UploadData;
import su.kww.realttranslator.core.api.remote.domstor.entities.options_domstor_data.UploadResult;
import su.kww.realttranslator.translators.builder.ResultProcessService;
import su.kww.realttranslator.translators.builder.TranslatorService;
import su.kww.realttranslator.translators.service.yandex.offer.YandexAdvert;
import su.kww.realttranslator.translators.service.yandex.offer.YandexAdvertOffer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import java.io.File;
import java.util.stream.Collectors;

public class YandexTranslatorService implements TranslatorService {

    public YandexTranslatorService(){}

    public YandexTranslatorService(String siteKey){
        this.siteKey = siteKey;
    }

    private String siteKey;

    public ResultProcessService<File> process(Set<AdvertSite> advertSites, UserNamePassword usernamePassword){

        Set<YandexAdvertOffer> yandexAdvertOffers = advertSites.parallelStream()
                                                               .map(this::createYandexAdvertOffer)
                                                               .collect(Collectors.toSet());
        YandexAdvert yandexAdvert = new YandexAdvert();
        yandexAdvert.setOffer(yandexAdvertOffers);

        try {
            buildXmlFile(yandexAdvert);
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        uploadOnServer(usernamePassword);

        return YandexResultProcessService.build(advertSites);
    }

    protected void buildXmlFile(YandexAdvert yandexAdvert) throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(yandexAdvert.getClass());
        Marshaller marshaller = context.createMarshaller();
        marshaller.marshal(yandexAdvert, new FileWriter("yandex.xml"));
    }


    protected YandexAdvertOffer createYandexAdvertOffer(AdvertSite advertSite){
        return new YandexAdvertOffer();
    }

    protected void uploadOnServer(UserNamePassword usernamePassword){
            File file = new File("yandex.xml");

            RequestBody requestBody = RequestBody.create(MediaType.parse("*/*"), file);
            MultipartBody.Part fileToUpload = MultipartBody.Part.createFormData("data", file.getName(), requestBody);
            RequestBody filename = RequestBody.create(MediaType.parse("text/plain"), file.getName());

            Observable<UploadResult> resultObservable =  DaggerDomstorComponent.create().getDomstorApiConfig()
                    .setUserNamePassword(usernamePassword)
                    .postDomstorData(fileToUpload, filename);

            resultObservable
                    .doOnError(e->e.getMessage())
                    .subscribe(System.out::print).dispose();
    }

}
