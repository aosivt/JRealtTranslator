package su.kww.realttranslator.translators.service.kemdom;

import su.kww.realttranslator.translators.service.yandex.YandexTranslatorService;

public class KemdomTranslatorService extends YandexTranslatorService {
    @Override
    public String getSiteKey() {
        return "kemdom";
    }
}
