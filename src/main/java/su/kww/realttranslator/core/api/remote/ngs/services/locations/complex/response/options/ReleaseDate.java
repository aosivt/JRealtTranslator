package su.kww.realttranslator.core.api.remote.ngs.services.locations.complex.response.options;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ReleaseDate {

    @SerializedName("year")
    @Expose
    private Integer year;
    @SerializedName("quarter")
    @Expose
    private Integer quarter;

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getQuarter() {
        return quarter;
    }

    public void setQuarter(Integer quarter) {
        this.quarter = quarter;
    }

}
