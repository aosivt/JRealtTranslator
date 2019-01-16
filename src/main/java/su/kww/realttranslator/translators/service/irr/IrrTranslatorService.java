package su.kww.realttranslator.translators.service.irr;

import su.kww.realttranslator.translators.service.yandex.YandexTranslatorService;

public class IrrTranslatorService extends YandexTranslatorService {
    @Override
    public String getSiteKey() {
        return "irr";
    }
}
