package su.kww.realttranslator.translators.builder;


import su.kww.realttranslator.translators.service.yandex.YandexTranslatorService;


public enum BuildOptions {
    YANDEX{
        @Override
        public TranslatorService getTranslator() {
            return new YandexTranslatorService();
        }
    };

    public abstract TranslatorService getTranslator();
}
