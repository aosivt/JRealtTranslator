package su.kww.realttranslator.core.api.remote.ngs.services.id.responses.options;

import java.util.List;
import java.util.Set;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Billing {

    @SerializedName("weight")
    @Expose
    private Integer weight;
    @SerializedName("options")
    @Expose
    private Set<Object> options = null;
    @SerializedName("active_options")
    @Expose
    private Set<Object> activeOptions = null;
    @SerializedName("promotion")
    @Expose
    private Object promotion;

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Set<Object> getOptions() {
        return options;
    }

    public void setOptions(Set<Object> options) {
        this.options = options;
    }

    public Set<Object> getActiveOptions() {
        return activeOptions;
    }

    public void setActiveOptions(Set<Object> activeOptions) {
        this.activeOptions = activeOptions;
    }

    public Object getPromotion() {
        return promotion;
    }

    public void setPromotion(Object promotion) {
        this.promotion = promotion;
    }

}
