package su.kww.realttranslator.core.api.remote.ngs.services.locations.region;

public class NgsRegionItem {
    private Integer id;
    private String host, url;

    public NgsRegionItem(){}
    public NgsRegionItem(Integer id,String host,String url){
        this.id = id;
        this.host = host;
        this.url = url;
    }

}
