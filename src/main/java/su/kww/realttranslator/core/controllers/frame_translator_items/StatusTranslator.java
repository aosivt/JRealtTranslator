package su.kww.realttranslator.core.controllers.frame_translator_items;

import javafx.scene.layout.VBox;

public enum StatusTranslator {
    TRUE{
        @Override
        public VBox checkActive(FrameTranslators frameTranslators) {
            return frameTranslators.activeBox;
        }
    },
    NULL{
        @Override
        public VBox checkActive(FrameTranslators frameTranslators) {
            return frameTranslators.withoutSetupBox;
        }
    },
    FALSE{
        @Override
        public VBox checkActive(FrameTranslators frameTranslators) {
            return frameTranslators.notActiveBox;
        }
    };
    public abstract VBox checkActive(FrameTranslators frameTranslators);
}
