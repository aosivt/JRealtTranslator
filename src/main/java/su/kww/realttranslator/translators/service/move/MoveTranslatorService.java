package su.kww.realttranslator.translators.service.move;

import su.kww.realttranslator.translators.service.yandex.YandexTranslatorService;

public class MoveTranslatorService extends YandexTranslatorService {
    @Override
    public String getSiteKey() {
        return "move";
    }
}
