package su.kww.realttranslator.translators.services.cian;

import su.kww.realttranslator.translators.services.yandex.YandexTranslatorService;

public class CianTranslatorService extends YandexTranslatorService {
    @Override
    public String getSiteKey() {
        return "cian";
    }
}
