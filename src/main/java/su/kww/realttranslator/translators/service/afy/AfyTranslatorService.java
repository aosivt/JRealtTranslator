package su.kww.realttranslator.translators.service.afy;

import su.kww.realttranslator.translators.service.yandex.YandexTranslatorService;

public class AfyTranslatorService extends YandexTranslatorService {
    @Override
    public String getSiteKey() {
        return "afy";
    }
}
