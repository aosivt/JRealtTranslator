package services.ngs.login;

import org.junit.Before;
import org.junit.Test;
import su.kww.realttranslator.core.api.remote.ngs.DaggerNgsComponent;

import java.util.HashMap;
import java.util.Map;

public class TestAuth {
    Map<String,String> auth;
    @Before
    public void setAuthData(){
        auth = new HashMap<>();
        auth.put("from","");
        auth.put("login","rcn3120240@mail.ru");
        auth.put("password","0305tdf");
    }

    @Test
    public void testAuthNgs(){

        DaggerNgsComponent.create().getNgsApiConfig()
                                   .postDomstorData("",auth)
                                   .doOnError(e->
                                   {
                                       System.out.println(e);
                                   })
                                   .subscribe(this::checkLogin);
    }

    private void checkLogin(Object login){
        System.out.println(login);
    }
}
