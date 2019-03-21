package su.kww.realttranslator.core.api.remote.ngs.services.locations.street;

import su.kww.realttranslator.core.api.remote.ngs.services.locations.street.response.options.Result;

public class NgsStreetItem {

    private Integer id;
    private String name;

    public NgsStreetItem(){};

    public NgsStreetItem(Result result){
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
