package su.kww.realttranslator.core.api.remote.ngs.services.auth.responce.options;

public class User {
    private Integer id;
    private String login;
    private Token token;

    public Integer getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public Token getToken() {
        return token;
    }
}
