package su.kww.realttranslator.translators.services.afy;

import su.kww.realttranslator.translators.services.yandex.YandexTranslatorService;

public class AfyTranslatorService extends YandexTranslatorService {
    @Override
    public String getSiteKey() {
        return "afy";
    }
}
