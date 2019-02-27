package su.kww.realttranslator.translators.services.mirkvartir;

import su.kww.realttranslator.translators.services.yandex.YandexTranslatorService;

public class MirkvartirTranslatorService extends YandexTranslatorService {
    @Override
    public String getSiteKey() {
        return "mirkvartir";
    }
}
