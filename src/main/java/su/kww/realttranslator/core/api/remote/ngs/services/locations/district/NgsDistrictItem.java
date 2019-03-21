package su.kww.realttranslator.core.api.remote.ngs.services.locations.district;

import su.kww.realttranslator.core.api.remote.ngs.services.locations.district.response.options.Result;

public class NgsDistrictItem {

    private Integer id;
    private String name;

    public NgsDistrictItem(){};

    public NgsDistrictItem(Result result){
        id = result.getId();
        name = result.getName();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
