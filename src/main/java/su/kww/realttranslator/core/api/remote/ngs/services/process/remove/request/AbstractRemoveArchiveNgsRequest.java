package su.kww.realttranslator.core.api.remote.ngs.services.process.remove.request;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public abstract class AbstractRemoveArchiveNgsRequest {
    protected Integer id;
    protected String jsonrpc;
    protected String method;
    protected Set params;

    public AbstractRemoveArchiveNgsRequest(){
        id = 1;
        jsonrpc = "2.0";
        params = new HashSet<>();
    }

    public AbstractRemoveArchiveNgsRequest addParams(Integer removeId){
        params.add(Arrays.asList(removeId));
        return this;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJsonrpc() {
        return jsonrpc;
    }

    public void setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Set<Integer> getParams() {
        return params;
    }

    public void setParams(Set<Integer> params) {
        this.params = params;
    }
}
