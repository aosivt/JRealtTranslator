package su.kww.realttranslator.translators.services.wiweb;

import su.kww.realttranslator.translators.services.yandex.YandexTranslatorService;

public class WiwebTranslatorService extends YandexTranslatorService {
    @Override
    public String getSiteKey() {
        return "wiweb";
    }
}
