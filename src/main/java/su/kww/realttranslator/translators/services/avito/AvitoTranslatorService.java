package su.kww.realttranslator.translators.services.avito;

import su.kww.realttranslator.core.api.inside.database.entities.AdvertSite;
import su.kww.realttranslator.core.api.remote.domstor.UserNamePassword;
import su.kww.realttranslator.translators.builders.service.AbstractTranslatorService;
import su.kww.realttranslator.translators.builders.ResultProcessService;
import su.kww.realttranslator.translators.services.avito.offer.AvitoAdvert;
import su.kww.realttranslator.translators.services.avito.offer.builders.BuilderAvitoAdvert;
import su.kww.realttranslator.translators.services.yandex.YandexResultProcessService;
import su.kww.realttranslator.translators.services.yandex.offer.YandexAdvert;
import su.kww.realttranslator.translators.services.yandex.offer.builders.BuilderYandexAdvert;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;

public class AvitoTranslatorService extends AbstractTranslatorService {

    @Override
    public ResultProcessService process(Set<AdvertSite> advertSites, UserNamePassword usernamePassword) {

        AvitoAdvert avitoAdvert = BuilderAvitoAdvert.build(advertSites);

        try {
            buildXmlFile(avitoAdvert);
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        uploadOnServer(usernamePassword);

        return YandexResultProcessService.build(advertSites);
    }

    protected void buildXmlFile(AvitoAdvert avitoAdvert) throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(avitoAdvert.getClass());
        Marshaller marshaller = context.createMarshaller();
        marshaller.marshal(avitoAdvert, new FileWriter(getFeedSite()));
    }

    @Override
    public String getSiteKey() {
        return "avito";
    }

    @Override
    public String getSiteFormat() {
        return "xml";
    }
}
