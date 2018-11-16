package su.kww.realttranslator.core.controllers.frame_translators;

import su.kww.realttranslator.core.api.remote.domstor.services.DomstorApiConfig;

import javax.inject.Inject;


public class FrameTranslators extends BaseFrameTranslators {

    @Inject
    DomstorApiConfig domstorApiConfig;

    public FrameTranslators(){}

    public DomstorApiConfig getDomstorApiConfig() {
        return domstorApiConfig;
    }
}
