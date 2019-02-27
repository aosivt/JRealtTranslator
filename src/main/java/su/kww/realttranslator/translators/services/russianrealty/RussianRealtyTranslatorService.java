package su.kww.realttranslator.translators.services.russianrealty;

import su.kww.realttranslator.translators.services.yandex.YandexTranslatorService;

public class RussianRealtyTranslatorService extends YandexTranslatorService {
    @Override
    public String getSiteKey() {
        return "russianrealty";
    }
}
