package su.kww.realttranslator.translators.services.vestum;

import su.kww.realttranslator.translators.services.yandex.YandexTranslatorService;

public class VestumTranslatorService extends YandexTranslatorService {
    @Override
    public String getSiteKey() {
        return "vestum";
    }
}
