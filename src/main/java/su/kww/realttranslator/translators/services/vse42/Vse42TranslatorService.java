package su.kww.realttranslator.translators.services.vse42;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import su.kww.realttranslator.core.api.inside.database.entities.AdvertSite;
import su.kww.realttranslator.core.api.remote.domstor.UserNamePassword;
import su.kww.realttranslator.translators.builders.service.AbstractTranslatorService;
import su.kww.realttranslator.translators.builders.ResultProcessService;
import su.kww.realttranslator.translators.services.vse42.builders.BuilderVse42Advert;
import su.kww.realttranslator.translators.services.vse42.builders.offer.Vse42AdvertOffer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Set;

public class Vse42TranslatorService extends AbstractTranslatorService {
    @Override
    public ResultProcessService process(Set<AdvertSite> advertSites, UserNamePassword usernamePassword) {

        Set<Vse42AdvertOffer> vse42Advert = BuilderVse42Advert.build(advertSites);

        try {
            buildFile(vse42Advert);
        } catch (IOException e) {
            e.printStackTrace();
        }
        uploadOnServer(usernamePassword);

        return Vse42ResultProcessService.build(advertSites);

    }

    private void buildFile(Set<Vse42AdvertOffer> vse42Advert) throws IOException {
        try (Writer writer = new FileWriter(getFeedSite())) {
            Gson gson = new GsonBuilder().create();
            gson.toJson(vse42Advert, writer);
        }
    }



    @Override
    public String getSiteKey() {
        return "vse42";
    }

    @Override
    public String getSiteFormat() {
        return "json";
    }
}
