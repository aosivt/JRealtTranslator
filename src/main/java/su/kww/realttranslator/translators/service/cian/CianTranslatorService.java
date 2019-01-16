package su.kww.realttranslator.translators.service.cian;

import su.kww.realttranslator.translators.service.yandex.YandexTranslatorService;

public class CianTranslatorService extends YandexTranslatorService {
    @Override
    public String getSiteKey() {
        return "cian";
    }
}
