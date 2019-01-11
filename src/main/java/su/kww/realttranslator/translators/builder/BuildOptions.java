package su.kww.realttranslator.translators.builder;


import su.kww.realttranslator.translators.service.yandex.YandexTranslatorService;


public enum BuildOptions {
    YANDEX{
        @Override
        public TranslatorService getTranslator() {
            return new YandexTranslatorService();
        }
    },
    AVITO{
        @Override
        public TranslatorService getTranslator() {
            return new YandexTranslatorService();
        }
    },
    IRR{
        @Override
        public TranslatorService getTranslator() {
            return new YandexTranslatorService();
        }
    },
    NGS{
        @Override
        public TranslatorService getTranslator() {
            return new YandexTranslatorService();
        }
    },
    VSE42{
        @Override
        public TranslatorService getTranslator() {
            return new YandexTranslatorService();
        }
    },
    MIRKVARTIR{
        @Override
        public TranslatorService getTranslator() {
            return new YandexTranslatorService();
        }
    },
    NNBAZA{
        @Override
        public TranslatorService getTranslator() {
            return new YandexTranslatorService();
        }
    },
    AFY{
        @Override
        public TranslatorService getTranslator() {
            return new YandexTranslatorService();
        }
    },
    CHOISTER{
        @Override
        public TranslatorService getTranslator() {
            return new YandexTranslatorService();
        }
    },
    BEBOSS{
        @Override
        public TranslatorService getTranslator() {
            return new YandexTranslatorService();
        }
    },
    KEMDOM{
        @Override
        public TranslatorService getTranslator() {
            return new YandexTranslatorService();
        }
    },
    RESTATE{
        @Override
        public TranslatorService getTranslator() {
            return new YandexTranslatorService();
        }
    },
    RUSSIAN_REALTY{
        @Override
        public TranslatorService getTranslator() {
            return new YandexTranslatorService();
        }
    },
    DOMCLICK{
        @Override
        public TranslatorService getTranslator() {
            return new YandexTranslatorService();
        }
    },
    CIAN{
        @Override
        public TranslatorService getTranslator() {
            return new YandexTranslatorService();
        }
    },
    RENTZILLA{
        @Override
        public TranslatorService getTranslator() {
            return new YandexTranslatorService();
        }
    },
    BESTRU{
        @Override
        public TranslatorService getTranslator() {
            return new YandexTranslatorService();
        }
    },
    WIWEB{
        @Override
        public TranslatorService getTranslator() {
            return new YandexTranslatorService();
        }
    },
    ZAYDINAYDI{
        @Override
        public TranslatorService getTranslator() {
            return new YandexTranslatorService();
        }
    },
    MOVE{
        @Override
        public TranslatorService getTranslator() {
            return new YandexTranslatorService();
        }
    },
    VESTUM{
        @Override
        public TranslatorService getTranslator() {
            return new YandexTranslatorService();
        }
    };
    public abstract TranslatorService getTranslator();
}
