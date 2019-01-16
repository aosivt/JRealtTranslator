package su.kww.realttranslator.translators.service.restate;

import su.kww.realttranslator.translators.service.yandex.YandexTranslatorService;

public class RestateTranslatorService extends YandexTranslatorService {
    @Override
    public String getSiteKey() {
        return "restate";
    }
}
