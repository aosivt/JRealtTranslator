package su.kww.realttranslator.core.controllers.item_translator;

import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;
import javafx.scene.image.Image;
import org.reactivestreams.Publisher;
import su.kww.realttranslator.core.api.inside.database.entities.Site;
import su.kww.realttranslator.core.controllers.frame_translator_items.BaseFrameTranslators;

public interface TranslatorItem {

    Site getSite();
    TranslatorItem setSite(final Site site);

    TranslatorItem setSitePublisher(PublishSubject<Site> sitePublisher);

    TranslatorItem createLogo();

    BaseFrameTranslators getBaseFrameTranslators();

    TranslatorItem setBaseFrameTranslators(BaseFrameTranslators baseFrameTranslators);

}
