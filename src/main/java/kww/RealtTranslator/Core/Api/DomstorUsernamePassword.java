package kww.RealtTranslator.Core.Api;

import kww.RealtTranslator.Core.Api.Interfaces.UserNamePassword;

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
