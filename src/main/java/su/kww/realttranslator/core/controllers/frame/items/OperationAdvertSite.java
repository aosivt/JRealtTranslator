package su.kww.realttranslator.core.controllers.frame.items;

import javafx.scene.control.Label;

public enum OperationAdvertSite {

    ADDOFFER("Добавить"){
        @Override
        public void countOffer(TranslatorItem translatorItem) {
            addCountOnLabel(translatorItem.getAddOffer());
        }
    },
    UPDATEOFFER("Обновить"){
        @Override
        public void countOffer(TranslatorItem translatorItem) {
            addCountOnLabel(translatorItem.getUpdateOffer());
        }
    },
    DELETEOFFER("Удалить"){
        @Override
        public void countOffer(TranslatorItem translatorItem) {
            addCountOnLabel(translatorItem.getDeleteOffer());
        }
    };

    private final String nameOperation;
    OperationAdvertSite(String nameOperation){
        this.nameOperation = nameOperation;
    }

    public abstract void countOffer(TranslatorItem translatorItem);

    protected void addCountOnLabel(Label label){
        String tempText = String.format("%s:%s",nameOperation,getCountLabelPlusOne(label));
        label.setText(tempText);
    }

    private Integer getCountLabelPlusOne(Label label){
        return getCountLabel(label.getText())+1;
    }

    private Integer getCountLabel(String stringLabelText){
        String[] tempArray = stringLabelText.split(":");
        if (tempArray.length==1) return 0;
        return Integer.parseInt(tempArray[1]);
    }
}
