package services.ngs.login;


import org.junit.Before;
import org.junit.Test;
import su.kww.realttranslator.core.api.remote.ngs.DaggerNgsComponent;

import static org.junit.Assert.*;
public class TestAuth {

    private String pass = "0305tdf";
    private String user = "rcn3120240@mail.ru";
    @Before
    public void setAuthData(){}

    @Test
    public void testAuthNgsWithRetrofit(){
        assertAuthNgs();
    }

    private void assertAuthNgs(){
        String t = DaggerNgsComponent.create().getNgsApiConfig()
                                   .auth(pass,user)
                                   .getToken();
        assertNotNull(t);
    }
}
