package su.kww.realttranslator.translators.service.wiweb;

import su.kww.realttranslator.translators.service.yandex.YandexTranslatorService;

public class WiwebTranslatorService extends YandexTranslatorService {
    @Override
    public String getSiteKey() {
        return "wiweb";
    }
}
