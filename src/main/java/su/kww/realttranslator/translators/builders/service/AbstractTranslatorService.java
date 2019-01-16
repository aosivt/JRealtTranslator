package su.kww.realttranslator.translators.builders.service;

public abstract class AbstractTranslatorService implements TranslatorService{

    @Override
    public String getFeedSite() {
        return String.format("%s.%s",getSiteKey(),getSiteFormat());
    }
}
