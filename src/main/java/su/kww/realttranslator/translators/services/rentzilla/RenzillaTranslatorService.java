package su.kww.realttranslator.translators.services.rentzilla;

import su.kww.realttranslator.translators.services.yandex.YandexTranslatorService;

public class RenzillaTranslatorService extends YandexTranslatorService {
    @Override
    public String getSiteKey() {
        return "rentzilla";
    }
}
