package services.ngs.login;

import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import su.kww.realttranslator.core.api.remote.ngs.DaggerNgsComponent;
import su.kww.realttranslator.core.api.remote.ngs.services.request.NgsAuthRequest;
import su.kww.realttranslator.core.api.remote.ngs.services.responce.auth.NgsAuthResponce;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class TestAuth {
    NgsAuthRequest ngsAuthRequest;
    @Before
    public void setAuthData(){
        ngsAuthRequest = new NgsAuthRequest();
        ngsAuthRequest.setUsername("rcn3120240@mail.ru");
        ngsAuthRequest.setPassword("0305tdf");
        ngsAuthRequest.setType("password");
    }


    @Test
    public void testAuthNgsWithRetrofit(){
        assertAuthNgs();
    }

    private void assertAuthNgs(){


        DaggerNgsComponent.create().getNgsApiConfig()
                                   .postAuthNgs(ngsAuthRequest)
                                   .subscribe(this::checkLogin);
    }

    private void checkLogin(NgsAuthResponce login){
        System.out.println(login);
    }

//    private void assertAuth(){
//
//        NgsAuthRequest ngsAuthRequest = new NgsAuthRequest();
//        ngsAuthRequest.setUsername("rcn3120240@mail.ru");
//        ngsAuthRequest.setPassword("0305tdf");
//        ngsAuthRequest.setType("password");
//
//        Call temp = DaggerNgsComponent.create().getNgsApiConfig()
//                .postAuth(ngsAuthRequest);
//        try {
//            Response t = temp.execute();
////            StringBuilder buffer = new StringBuilder();
////
////            String line;
////            while ((line = reader.readLine()) != null) {
////                buffer.append(line);
////            }
////            String data = buffer.toString()
//            checkLogin(t);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        ;
//        temp.enqueue(new Callback() {
//            @Override
//            public void onResponse(Call call, Response response) {
//
//                checkLogin(new Gson().toJson(response.body()));
////                    Log.e("TAG", "response 33: "+new Gson().toJson(response.body()) );
//            }
//
//            @Override
//            public void onFailure(Call call, Throwable t) {
//                checkLogin("onFailure: "+t.toString());
////                    Log.e("TAG", "onFailure: "+t.toString() );
//                // Log error here since request failed
//            }
//        });
//
//
////                                   .doOnError(e->
////                                   {
////                                       System.out.println(e);
////                                   })
////                                   .subscribe(this::checkLogin);
//    }
}
