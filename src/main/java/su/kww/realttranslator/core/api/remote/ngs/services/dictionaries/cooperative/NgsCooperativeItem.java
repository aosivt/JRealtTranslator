package su.kww.realttranslator.core.api.remote.ngs.services.dictionaries.cooperative;


import su.kww.realttranslator.core.api.remote.ngs.services.dictionaries.respose.options.Value;

public class NgsCooperativeItem {

    private Integer id;
    private String name;

    public NgsCooperativeItem(){}

    public NgsCooperativeItem(Value result){
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
