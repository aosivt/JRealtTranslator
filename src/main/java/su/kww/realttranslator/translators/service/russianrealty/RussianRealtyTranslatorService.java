package su.kww.realttranslator.translators.service.russianrealty;

import su.kww.realttranslator.translators.service.yandex.YandexTranslatorService;

public class RussianRealtyTranslatorService extends YandexTranslatorService {
    @Override
    public String getSiteKey() {
        return "russianrealty";
    }
}
