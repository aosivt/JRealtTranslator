package kww.RealtTranslator.Core.Api;

public class AuthenticationRequiredEventArgs {
    private String message;
    private DomstorUsernamePassword domstorUsernamePassword;

    public AuthenticationRequiredEventArgs(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    private void setMessage(String message) {
        this.message = message;
    }

    public DomstorUsernamePassword getDomstorUsernamePassword() {
        return domstorUsernamePassword;
    }

    public void setDomstorUsernamePassword(DomstorUsernamePassword domstorUsernamePassword) {
        this.domstorUsernamePassword = domstorUsernamePassword;
    }
}
