package su.kww.realttranslator.core.api.remote.ngs.services.auth.request;

import javax.inject.Inject;

public class NgsAuthRequest {

    @Inject
    public NgsAuthRequest(){
        setType("password");
    }

    private String username;
    private String password;
    private String type;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
