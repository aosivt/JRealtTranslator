package su.kww.realttranslator.translators.service.beboss;

import su.kww.realttranslator.translators.service.yandex.YandexTranslatorService;

public class BebossTranslatorService extends YandexTranslatorService {
    @Override
    public String getSiteKey() {
        return "beboss";
    }

}
