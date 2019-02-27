package services.ngs.login;

import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import su.kww.realttranslator.core.api.remote.ngs.DaggerNgsComponent;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TestAuth {
    Map<String,String> auth;
    @Before
    public void setAuthData(){
        auth = new HashMap<>();
        auth.put("from","");
//        auth.put("login","rcn3120240@mail.ru");
//        auth.put("password","0305tdf");
        auth.put("login","test@mail.ru");
        auth.put("password","test");
    }

    @Test
    public void testAuthNgs(){


        Call temp = DaggerNgsComponent.create().getNgsApiConfig()
                                       .postDomstorData("",auth);
        try {
            Response t = temp.execute();
//            StringBuilder buffer = new StringBuilder();
//
//            String line;
//            while ((line = reader.readLine()) != null) {
//                buffer.append(line);
//            }
//            String data = buffer.toString()
            checkLogin(t);
        } catch (IOException e) {
            e.printStackTrace();
        }
        ;
            temp.enqueue(new Callback() {
                @Override
                public void onResponse(Call call, Response response) {

                    checkLogin(new Gson().toJson(response.body()));
//                    Log.e("TAG", "response 33: "+new Gson().toJson(response.body()) );
                }

                @Override
                public void onFailure(Call call, Throwable t) {
                    checkLogin("onFailure: "+t.toString());
//                    Log.e("TAG", "onFailure: "+t.toString() );
                    // Log error here since request failed
                }
            });


//                                   .doOnError(e->
//                                   {
//                                       System.out.println(e);
//                                   })
//                                   .subscribe(this::checkLogin);
    }

    private void checkLogin(Object login){
        System.out.println(login);
    }
}
