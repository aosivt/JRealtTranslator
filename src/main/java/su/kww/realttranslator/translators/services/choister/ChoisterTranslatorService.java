package su.kww.realttranslator.translators.services.choister;

import su.kww.realttranslator.translators.services.yandex.YandexTranslatorService;

public class ChoisterTranslatorService extends YandexTranslatorService {
    @Override
    public String getSiteKey() {
        return "choister";
    }
}
