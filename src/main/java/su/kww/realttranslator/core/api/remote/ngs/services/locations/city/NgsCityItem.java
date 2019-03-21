package su.kww.realttranslator.core.api.remote.ngs.services.locations.city;

import su.kww.realttranslator.core.api.remote.ngs.services.locations.city.response.options.Result;

public class NgsCityItem {

    private Integer id, areaId;
    private String name, areaName;

    public NgsCityItem(){};

    public NgsCityItem(Result result){
        id = result.getId();
        areaId = result.getAreaId();
        name = result.getName();
        areaName = result.getAreaName();
    };


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }
}
