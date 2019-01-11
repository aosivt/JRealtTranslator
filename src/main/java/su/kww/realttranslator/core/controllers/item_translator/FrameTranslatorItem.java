package su.kww.realttranslator.core.controllers.item_translator;

import io.reactivex.subjects.PublishSubject;
import su.kww.realttranslator.core.api.inside.database.entities.Site;
import su.kww.realttranslator.core.controllers.frame_translator_items.BaseFrameTranslators;
import su.kww.realttranslator.translators.builder.TranslatorServiceBuilder;

public class FrameTranslatorItem extends BaseTranslatorItem {



    @Override
    public Site getSite() {
        return site;
    }

    @Override
    public TranslatorItem setSite(final Site site) {
        this.site = site;
        return this;
    }

    @Override
    public BaseFrameTranslators getBaseFrameTranslators() {
        return frameTranslators;
    }

    @Override
    public TranslatorItem setBaseFrameTranslators(BaseFrameTranslators baseFrameTranslators) {
        frameTranslators = baseFrameTranslators;
        return this;
    }

    @Override
    public TranslatorItem setSitePublisher(PublishSubject<Site> sitePublisher) {
        this.sitePublisher = sitePublisher;
        return this;
    }

    @Override
    public TranslatorItem initTranslator() {
        createLogo();
        fieldingInfo();
        initTranslatorService();
        return this;
    }
}
