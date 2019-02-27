package su.kww.realttranslator.translators.services.beboss;

import su.kww.realttranslator.translators.services.yandex.YandexTranslatorService;

public class BebossTranslatorService extends YandexTranslatorService {
    @Override
    public String getSiteKey() {
        return "beboss";
    }

}
