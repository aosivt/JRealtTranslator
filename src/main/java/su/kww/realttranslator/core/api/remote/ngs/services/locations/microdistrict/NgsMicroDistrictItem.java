package su.kww.realttranslator.core.api.remote.ngs.services.locations.microdistrict;

import su.kww.realttranslator.core.api.remote.ngs.services.locations.microdistrict.response.options.Result;

public class NgsMicroDistrictItem {

    private Integer id;
    private String name;

    public NgsMicroDistrictItem(){};

    public NgsMicroDistrictItem(Result result){
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
