package su.kww.realttranslator.core.controllers.item_translator;

import javafx.scene.image.Image;
import su.kww.realttranslator.core.api.inside.database.entities.Site;

public interface TranslatorItem {

    Site getSite();
    TranslatorItem setSite(final Site site);

    TranslatorItem createLogo();

}
