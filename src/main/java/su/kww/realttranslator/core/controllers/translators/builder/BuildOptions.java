package su.kww.realttranslator.core.controllers.translators.builder;

import su.kww.realttranslator.core.controllers.translators.TranslatorItem;
import su.kww.realttranslator.core.controllers.translators.yandex.YandexTranslatorItem;

public enum BuildOptions {
    YANDEX_TRANSLATOR("yandex"){
        @Override
        public TranslatorItem getTranslatorItem() {
            return new YandexTranslatorItem();
        }
    };

    BuildOptions(String siteKey){
        this.siteKey = siteKey;
    }
    private final String siteKey;
    private TranslatorItem translatorItem;

    public TranslatorItem getTranslatorByKey(){
        return translatorItem;
    }

    public String getSiteKey() {
        return siteKey;
    }

    public TranslatorItem getTranslatorItem(){
        return new TranslatorItem();
    }
}
