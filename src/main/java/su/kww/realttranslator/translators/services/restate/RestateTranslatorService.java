package su.kww.realttranslator.translators.services.restate;

import su.kww.realttranslator.translators.services.yandex.YandexTranslatorService;

public class RestateTranslatorService extends YandexTranslatorService {
    @Override
    public String getSiteKey() {
        return "restate";
    }
}
