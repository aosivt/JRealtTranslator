package su.kww.realttranslator.translators.services.yandex;

import su.kww.realttranslator.core.api.inside.database.entities.AdvertSite;
import su.kww.realttranslator.core.api.remote.domstor.UserNamePassword;
import su.kww.realttranslator.translators.builders.service.AbstractTranslatorService;
import su.kww.realttranslator.translators.builders.ResultProcessService;
import su.kww.realttranslator.translators.services.yandex.offer.builders.BuilderYandexAdvert;
import su.kww.realttranslator.translators.services.yandex.offer.YandexAdvert;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;

import java.io.File;

public class YandexTranslatorService extends AbstractTranslatorService {

    public YandexTranslatorService(){}

    public ResultProcessService<File> process(Set<AdvertSite> advertSites, UserNamePassword usernamePassword){

        YandexAdvert yandexAdvert = BuilderYandexAdvert.build(advertSites);

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
        marshaller.marshal(yandexAdvert, new FileWriter(getFeedSite()));
    }

    @Override
    public String getSiteKey() {
        return "yandex";
    }

    @Override
    public String getSiteFormat() {
        return "xml";
    }

}
