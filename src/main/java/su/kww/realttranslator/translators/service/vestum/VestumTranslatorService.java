package su.kww.realttranslator.translators.service.vestum;

import su.kww.realttranslator.translators.service.yandex.YandexTranslatorService;

public class VestumTranslatorService extends YandexTranslatorService {
    @Override
    public String getSiteKey() {
        return "vestum";
    }
}
