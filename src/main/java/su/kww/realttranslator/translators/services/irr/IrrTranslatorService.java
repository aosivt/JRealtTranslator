package su.kww.realttranslator.translators.services.irr;

import su.kww.realttranslator.translators.services.yandex.YandexTranslatorService;

public class IrrTranslatorService extends YandexTranslatorService {
    @Override
    public String getSiteKey() {
        return "irr";
    }
}
