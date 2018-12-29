package su.kww.realttranslator.core.controllers.item_translator;

import su.kww.realttranslator.core.api.inside.database.entities.Site;

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


}
