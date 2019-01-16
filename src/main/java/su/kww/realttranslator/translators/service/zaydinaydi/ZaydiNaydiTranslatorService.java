package su.kww.realttranslator.translators.service.zaydinaydi;

import su.kww.realttranslator.translators.service.yandex.YandexTranslatorService;

public class ZaydiNaydiTranslatorService extends YandexTranslatorService {
    @Override
    public String getSiteKey() {
        return "zaydinaydi";
    }
}
