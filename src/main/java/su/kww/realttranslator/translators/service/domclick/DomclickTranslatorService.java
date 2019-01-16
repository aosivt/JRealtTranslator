package su.kww.realttranslator.translators.service.domclick;

import su.kww.realttranslator.translators.service.yandex.YandexTranslatorService;

public class DomclickTranslatorService extends YandexTranslatorService {
    @Override
    public String getSiteKey() {
        return "domclick";
    }
}
