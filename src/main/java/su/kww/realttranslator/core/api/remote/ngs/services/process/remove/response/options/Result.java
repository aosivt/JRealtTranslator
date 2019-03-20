package su.kww.realttranslator.core.api.remote.ngs.services.process.remove.response.options;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {
    private String id;
    @SerializedName("success_url")
    @Expose
    @JsonProperty("success_url")
    private String successUrl;

    @SerializedName("paymant_type")
    @Expose
    @JsonProperty("paymant_type")
    private String paymantType;
    private String error;
    private String offer;

    public String getId() {
        return id;
    }

    public String getSuccessUrl() {
        return successUrl;
    }

    public String getPaymantType() {
        return paymantType;
    }

    public String getError() {
        return error;
    }

    public String getOffer() {
        return offer;
    }
}
