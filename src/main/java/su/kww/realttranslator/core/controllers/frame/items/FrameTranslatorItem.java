package su.kww.realttranslator.core.controllers.frame.items;

import io.reactivex.subjects.PublishSubject;
import javafx.scene.layout.GridPane;
import su.kww.realttranslator.core.api.inside.database.entities.Site;
import su.kww.realttranslator.core.controllers.frame.BaseFrameTranslators;

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
        setSitePublisher(subscribeToSite());
        return this;
    }

    private PublishSubject<Site> subscribeToSite(){
        PublishSubject<Site> sitePublishSubject = PublishSubject.create();
        sitePublishSubject.subscribe(s->frameTranslators.updateTranslatorsFromDB());
        return sitePublishSubject;
    }
}
