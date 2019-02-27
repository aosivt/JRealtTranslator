package su.kww.realttranslator.translators.services.move;

import su.kww.realttranslator.translators.services.yandex.YandexTranslatorService;

public class MoveTranslatorService extends YandexTranslatorService {
    @Override
    public String getSiteKey() {
        return "move";
    }
}
