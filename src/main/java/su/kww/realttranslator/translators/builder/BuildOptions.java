package su.kww.realttranslator.translators.builder;


import su.kww.realttranslator.translators.items.yandex.YandexTranslator;


public enum BuildOptions {
    YANDEX{
        @Override
        public Translator getTranslator() {
            return new YandexTranslator();
        }
    };

    public abstract Translator getTranslator();
}
