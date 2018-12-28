package su.kww.realttranslator.core.controllers.translators.builder;

import su.kww.realttranslator.core.controllers.translators.TranslatorItem;
import su.kww.realttranslator.core.controllers.translators.yandex.YandexTranslatorItem;

public enum BuildOptions {
    YANDEX{
        @Override
        public TranslatorItem getTranslatorItem() {
            return new YandexTranslatorItem();
        }
    };

    public abstract TranslatorItem getTranslatorItem();
}
