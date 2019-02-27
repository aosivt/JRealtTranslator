package su.kww.realttranslator.translators.services.domclick;

import su.kww.realttranslator.translators.services.yandex.YandexTranslatorService;

public class DomclickTranslatorService extends YandexTranslatorService {
    @Override
    public String getSiteKey() {
        return "domclick";
    }
}
