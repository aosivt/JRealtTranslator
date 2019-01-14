package su.kww.realttranslator.core.controllers.frame.items;

import io.reactivex.subjects.PublishSubject;
import javafx.scene.control.Label;
import su.kww.realttranslator.core.api.inside.database.entities.Site;
import su.kww.realttranslator.core.controllers.frame.BaseFrameTranslators;
import su.kww.realttranslator.translators.builder.TranslatorService;

public interface TranslatorItem {

    Site getSite();
    TranslatorItem setSite(final Site site);

    TranslatorItem setSitePublisher(PublishSubject<Site> sitePublisher);

    TranslatorItem initTranslator();

    BaseFrameTranslators getBaseFrameTranslators();

    TranslatorItem setBaseFrameTranslators(BaseFrameTranslators baseFrameTranslators);

    Label getAddOffer() ;

    Label getUpdateOffer();

    Label getDeleteOffer() ;

    TranslatorService getTranslatorService();
}
