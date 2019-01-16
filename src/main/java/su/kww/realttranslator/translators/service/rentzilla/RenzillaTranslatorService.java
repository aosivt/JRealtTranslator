package su.kww.realttranslator.translators.service.rentzilla;

import su.kww.realttranslator.translators.service.yandex.YandexTranslatorService;

public class RenzillaTranslatorService extends YandexTranslatorService {
    @Override
    public String getSiteKey() {
        return "rentzilla";
    }
}
