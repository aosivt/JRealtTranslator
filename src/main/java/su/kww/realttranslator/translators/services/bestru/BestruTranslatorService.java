package su.kww.realttranslator.translators.services.bestru;

import su.kww.realttranslator.translators.services.yandex.YandexTranslatorService;

public class BestruTranslatorService extends YandexTranslatorService {
    @Override
    public String getSiteKey() {
        return "bestru";
    }
}
