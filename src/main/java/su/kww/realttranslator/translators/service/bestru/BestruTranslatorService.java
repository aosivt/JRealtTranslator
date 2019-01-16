package su.kww.realttranslator.translators.service.bestru;

import su.kww.realttranslator.translators.service.yandex.YandexTranslatorService;

public class BestruTranslatorService extends YandexTranslatorService {
    @Override
    public String getSiteKey() {
        return "bestru";
    }
}
