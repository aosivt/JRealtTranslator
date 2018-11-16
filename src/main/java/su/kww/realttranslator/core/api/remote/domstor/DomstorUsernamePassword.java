package su.kww.realttranslator.core.api.remote.domstor;

import su.kww.realttranslator.core.api.remote.domstor.UserNamePassword;
import su.kww.realttranslator.core.api.remote.domstor.services.DomstorApiConfig;

import javax.inject.Inject;

public class DomstorUsernamePassword implements UserNamePassword {

    private String userName;
    private String password;

    public DomstorUsernamePassword(String userName, String password){
        this.userName = userName;
        this.password = password;
    }


    public String getUsername() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

}
