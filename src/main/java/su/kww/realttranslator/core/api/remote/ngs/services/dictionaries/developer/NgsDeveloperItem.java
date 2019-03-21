package su.kww.realttranslator.core.api.remote.ngs.services.dictionaries.developer;

import su.kww.realttranslator.core.api.remote.ngs.services.dictionaries.respose.options.Value;

public class NgsDeveloperItem {

    private Integer id;
    private String name;

    public NgsDeveloperItem(){}

    public NgsDeveloperItem(Value result){
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
