package su.kww.realttranslator.core.api.remote.ngs.services;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Set;

public class AuthResponce {
    @SerializedName("title")
    @Expose
    String title;
    @SerializedName("text")
    @Expose
    String text;
    @SerializedName("fields")
    @Expose
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
