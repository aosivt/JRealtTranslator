package su.kww.realttranslator.translators.service.choister;

import su.kww.realttranslator.translators.service.yandex.YandexTranslatorService;

public class ChoisterTranslatorService extends YandexTranslatorService {
    @Override
    public String getSiteKey() {
        return "choister";
    }
}
