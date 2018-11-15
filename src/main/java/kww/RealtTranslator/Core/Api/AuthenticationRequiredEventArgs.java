package kww.RealtTranslator.Core.Api;

public class AuthenticationRequiredEventArgs {
    private String message;
    private UsernamePassword usernamePassword;

    public AuthenticationRequiredEventArgs(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    private void setMessage(String message) {
        this.message = message;
    }

    public UsernamePassword getUsernamePassword() {
        return usernamePassword;
    }

    public void setUsernamePassword(UsernamePassword usernamePassword) {
        this.usernamePassword = usernamePassword;
    }
}
