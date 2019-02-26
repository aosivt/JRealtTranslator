package su.kww.realttranslator.core.api.remote.ngs.services;

import java.util.Set;

public class AuthResponce {
    String title;
    String text;
    Set fields;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Set getFields() {
        return fields;
    }

    public void setFields(Set fields) {
        this.fields = fields;
    }
}
