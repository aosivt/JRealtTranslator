package su.kww.realttranslator.core.api.remote.ngs.services.locations.complex;

import su.kww.realttranslator.core.api.remote.ngs.services.locations.complex.response.options.Result;

public class NgsComplexItem {

    private Integer id;
    private String name;

    public NgsComplexItem(){};

    public NgsComplexItem(Result result){
        id = result.getId();
        name = result.getName();
    };


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
