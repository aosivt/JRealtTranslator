package su.kww.realttranslator.translators.services.kemdom;

import su.kww.realttranslator.translators.services.yandex.YandexTranslatorService;

public class KemdomTranslatorService extends YandexTranslatorService {
    @Override
    public String getSiteKey() {
        return "kemdom";
    }
}
