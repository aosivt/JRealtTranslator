package su.kww.realttranslator.translators.services.zaydinaydi;

import su.kww.realttranslator.translators.services.yandex.YandexTranslatorService;

public class ZaydiNaydiTranslatorService extends YandexTranslatorService {
    @Override
    public String getSiteKey() {
        return "zaydinaydi";
    }
}
