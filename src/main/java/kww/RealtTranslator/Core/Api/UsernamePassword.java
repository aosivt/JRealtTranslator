package kww.RealtTranslator.Core.Api;

import kww.RealtTranslator.Core.Api.Interfaces.IUserNamePassword;

public class UsernamePassword implements IUserNamePassword {

    private String userName;
    private String password;

    public UsernamePassword(String userName, String password){
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
