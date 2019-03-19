package services.ngs.process.add;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.reactivex.Observable;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.junit.Before;
import org.junit.Test;
import su.kww.realttranslator.core.api.remote.domstor.DaggerDomstorComponent;
import su.kww.realttranslator.core.api.remote.domstor.UserNamePassword;
import su.kww.realttranslator.core.api.remote.domstor.entities.options.domstor.data.UploadResult;
import su.kww.realttranslator.core.api.remote.ngs.DaggerNgsComponent;
import su.kww.realttranslator.core.api.remote.ngs.services.NgsApiConfig;
import su.kww.realttranslator.core.api.remote.ngs.services.auth.request.AuthNgsRequest;
import su.kww.realttranslator.core.api.remote.ngs.services.auth.responce.AuthNgsResponse;
import su.kww.realttranslator.core.api.remote.ngs.services.process.add.request.AddProcessNgsRequest;
import su.kww.realttranslator.core.api.remote.ngs.services.process.photo.options.BuilderJsonPropertyPhoto;
import su.kww.realttranslator.core.api.remote.ngs.services.process.photo.options.JsonPropertyPhoto;
import su.kww.realttranslator.core.api.remote.ngs.services.process.photo.response.UploadPhotoNgsResponse;

import java.io.File;
import java.util.*;

import static org.junit.Assert.*;

public class TestProcessAdd {
    AuthNgsRequest authNgsRequest;

    AddProcessNgsRequest dataForNgsForm;
    String token;
    private String pass = "pass123word";
//    private String pass = "0305tdf";
    private String user = "darkf00rce@gmail.com";
//    private String user = "rcn3120240@mail.ru";
    private String boundary = "---------------------------265283104014185";
    @Before
    public void setAuthData(){
        authNgsRequest = new AuthNgsRequest();
        authNgsRequest.setUsername("darkf00rce@gmail.com");
        authNgsRequest.setPassword("pass123word");
        authNgsRequest.setType("password");
        dataForNgsForm = getDataForNgsForm();
   }


    @Test
    public void testProcess(){
        assertAddDataToNgs();
    }

    private void assertAddDataToNgs(){
        NgsApiConfig ngsApiConfig = DaggerNgsComponent.create().getNgsApiConfig()
                .auth(user,pass)
                ;
//                .add(getDataForNgsForm());
        uploadOnServerByPartWithMap(ngsApiConfig);
    }

    private AddProcessNgsRequest getDataForNgsForm(){
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(getDataString(), AddProcessNgsRequest.class);
    }
    protected void uploadOnServerByPartWithMap(NgsApiConfig ngsApiConfig){
        Set<String> photoPath = new HashSet(
                Arrays.asList(
                        "D:\\projects\\JRealtTranslator\\.JRealtTranslator\\3_17910000004\\17910000000000022.JPG",
                        "D:\\projects\\JRealtTranslator\\.JRealtTranslator\\3_17910000004\\17910000000000023.JPG",
                        "D:\\projects\\JRealtTranslator\\.JRealtTranslator\\3_17910000004\\17910000000000024.JPG"
                )
        );

        Set<JsonPropertyPhoto> jsonPropertyPhotos = ngsApiConfig.uploadPhotos(photoPath);
        dataForNgsForm.setPhotos(jsonPropertyPhotos);
        ngsApiConfig.add(dataForNgsForm);
    }
    private String getDataString(){
        return  "{" +
                "\"rubric\":\"homes\"," +
                "\"deal_type\":\"sell\"," +
                "\"price\":\"650000\"," +
                "\"photos\":[]," +
                "\"description\":\"В продаже полноценная 2-х комнатная квартира, (Чулым 3). Квартира чистая, " +
                "светлая, теплая. Окна по всей квартиры пластиковые, новая входная дверь. Реальному покупателю торг.\"," +
                "\"contacts\": " +
                "   {\"person\": \"Алена Александровна\"," +
                "    \"organization_name\": \"Агентство недвижимости «Новосибирск Недвижимость»\"," +
                "    \"phones\": [{\"value\": \"89137707563\",         " +
                "   \"comment\": \"\"       }     ],     " +
                "\"email\": \"nn2633262@mail.ru\",     " +
                "\"address\": \"г. Новосибирск, Немировича -Данченко, 104\"   }," +
                "\"is_net_sale\": true," +
                "\"is_exchange\": false," +
                "\"is_pawn\": false," +
                "\"is_deposit\": false," +
                "\"is_mortgage\": false," +
                "\"agency_code\": null," +
                "\"house\": {" +
                "     \"material_type\": {       \"id\": \"374\"     }   }," +
        "        \"geo\": {     " +
                        "\"city\": {       \"id\": 2263012,       \"name\": \"Чулым-3\"     },     " +
                "       \"district\": null,     " +
                "       \"micro_district\": null,     " +
                "       \"street\": {       \"id\": 16071352,       \"name\": \"Центральная\"     },     " +
                "       \"house_number\": \"12\",     \"region\": {       \"id\": 54     }   }," +
                "\"rent_duration_type\": {     \"id\": \"544\"   }," +
                "\"total_area\": 41.2," +
                "\"living_area\": 24.8," +
                "\"kitchen_area\": 5.0," +
                "\"floor\": 1," +
                "\"floors_count\": 2," +
                "\"loggia_count\": null," +
                "\"balcony_count\": null," +
                "\"type\":{\"id\":\"100000000\"}," +
                "\"layout_type\":{\"id\":\"395\"}," +
                "\"condition_type\":{\"id\":\"163128\"}," +
                "\"ownership_type\":{\"id\":\"422\"}," +
                "\"wc_type\":{\"id\":\"400\"}," +
                "\"rooms_count_type\":{\"id\":\"367\"}}";
    }

}
