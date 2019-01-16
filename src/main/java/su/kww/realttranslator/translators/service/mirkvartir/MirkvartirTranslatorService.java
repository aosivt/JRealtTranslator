package su.kww.realttranslator.translators.service.mirkvartir;

import su.kww.realttranslator.translators.service.yandex.YandexTranslatorService;

public class MirkvartirTranslatorService extends YandexTranslatorService {
    @Override
    public String getSiteKey() {
        return "mirkvartir";
    }
}
