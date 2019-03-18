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
import su.kww.realttranslator.core.api.remote.ngs.services.process.photo.response.UploadPhotoNgsResponse;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class TestProcessAdd {
    AuthNgsRequest authNgsRequest;

    AddProcessNgsRequest dataForNgsForm;
    String token;
    private String pass = "0305tdf";
    private String user = "rcn3120240@mail.ru";
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
        NgsApiConfig ngsApiConfig = DaggerNgsComponent.create().getNgsApiConfig();

//        String t = ngsApiConfig.auth(user,pass).add(dataForNgsForm).getResponce();
//        assertNotNull(t);
//        uploadOnServer();
//        uploadOnServerByPart();
        uploadOnServerByPartWithMap();
    }


    private void exception(Throwable throwable) {
        System.out.println(throwable.getMessage());
    }

    private void  checkLogin(AuthNgsResponse login){
        System.out.println(login);
        token = login.getResult().getUser().getToken().getAccess();
    }

    private void checkPostToNgs(Object resp){
        System.out.println(resp);
    }

    private AddProcessNgsRequest getDataForNgsForm(){
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(getDataString(), AddProcessNgsRequest.class);
    }
    private String getDataString(){
        return  "{\"rubric\":\"homes\",\"deal_type\":\"sell\",\"price\":\"650000\",\"photos\":[],\"description\":\"В продаже полноценная 2-х комнатная квартира, (Чулым 3). Квартира чистая, светлая, теплая. Окна по всей квартиры пластиковые, новая входная дверь. Реальному покупателю торг.\",\"contacts\": {\"person\": \"Алена Александровна\",\"organization_name\": \"Агентство недвижимости «Новосибирск Недвижимость»\",\"phones\": [{\"value\": \"89137707563\",         \"comment\": \"\"       }     ],     \"email\": \"nn2633262@mail.ru\",     \"address\": \"г. Новосибирск, Немировича -Данченко, 104\"   },\"is_net_sale\": true,\"is_exchange\": false,\"is_pawn\": false,\"is_deposit\": false,\"is_mortgage\": false,\"agency_code\": null,\"house\": {     \"material_type\": {       \"id\": \"374\"     }   },\"geo\": {     \"city\": {       \"id\": 2263012,       \"name\": \"Чулым-3\"     },     \"district\": null,     \"micro_district\": null,     \"street\": {       \"id\": 16071352,       \"name\": \"Центральная\"     },     \"house_number\": \"12\",     \"region\": {       \"id\": 54     }   },\"rent_duration_type\": {     \"id\": \"544\"   },\"total_area\": 41.2,\"living_area\": 24.8,\"kitchen_area\": 5.0,\"floor\": 1,\"floors_count\": 2,\"loggia_count\": null,\"balcony_count\": null,\"type\":{\"id\":\"100000000\"},\"layout_type\":{\"id\":\"395\"},\"condition_type\":{\"id\":\"163128\"},\"ownership_type\":{\"id\":\"422\"},\"wc_type\":{\"id\":\"400\"},\"rooms_count_type\":{\"id\":\"367\"}}";
    }

//    protected void uploadOnServer(){
//        File file = new File("D:\\projects\\JRealtTranslator\\.JRealtTranslator\\3_430000007\\430000000000001.JPG");
//        RequestBody requestBody = RequestBody.create(MultipartBody.FORM, file);
//
//        MultipartBody fileToUpload =
//                new MultipartBody.Builder()
//                        .addFormDataPart("media", file.getName(), requestBody)
//                        .addFormDataPart("type","photo")
//                        .build()
//                ;
//
//
//        Observable<ResponseBody> resultObservable =
//                DaggerNgsComponent.create().getNgsApiConfig()
//                        .auth(user,pass)
//                        .uploadPhoto(fileToUpload);
//
//        resultObservable
//                .doOnError(this::error)
//                .subscribe(System.out::print).dispose();
//    }

//    protected void uploadOnServerByPart(){
//        File file = new File("D:\\projects\\JRealtTranslator\\.JRealtTranslator\\3_430000007\\430000000000001.JPG");
//        RequestBody requestFile = RequestBody.create(MultipartBody.FORM, file);
//
//
//        RequestBody requestType = RequestBody.create(MediaType.parse("text/plain"), "photo");
//
//        Observable<UploadPhotoNgsResponse> resultObservable =
//                DaggerNgsComponent.create().getNgsApiConfig()
//                        .auth(user,pass)
//                        .uploadPhotoByPart(requestType,requestFile);
//
//        resultObservable
//                .doOnError(this::error)
//                .subscribe(this::resp).dispose();
//    }
    protected void uploadOnServerByPartWithMap(){
        File file = new File("D:\\projects\\JRealtTranslator\\.JRealtTranslator\\3_430000007\\430000000000001.JPG");
//        RequestBody requestFile = RequestBody.create(MultipartBody.FORM, file);
        Map<String, RequestBody> requestFile = new HashMap<>();
        RequestBody fileBody =
                RequestBody.create(MultipartBody.FORM, file);
        requestFile.put("media\"; filename=\"".concat(file.getName()).concat("\""), fileBody);

        RequestBody requestType = RequestBody.create(MediaType.parse("text/plain"), "photo");

        Observable<UploadPhotoNgsResponse> resultObservable =
                DaggerNgsComponent.create().getNgsApiConfig()
                        .auth(user,pass)
                        .uploadPhotoByPart(requestType,requestFile);

        resultObservable
                .doOnError(this::error)
                .subscribe(this::resp).dispose();
    }

    private void resp(UploadPhotoNgsResponse responseBody) {
        System.out.println(responseBody);
    }

    private void error(Throwable throwable) {
        System.out.println(throwable.getMessage());
    }



//    public void setPostDataMultipart(WebRequest request, Dictionary<string, string> dict)
//    {
//        String boundary = "---------------------------265283104014185";
//        request.ContentType = "multipart/form-data; boundary=" + boundary;
//        request.Method = "POST";
//        byte[] EncodedPostParams;
//        using (var stream = request.GetRequestStream())
//        {
//            foreach (var item in dict)
//            {
//                if (File.Exists(item.Value))
//                {
//                    FileInfo fi = new FileInfo(item.Value);
//                    EncodedPostParams = this.Encoding.GetBytes(String.Format("--{0}\r\nContent-Disposition: form-data; name=\"{1}\"; filename=\"{2}\"\r\nContent-Type: image/jpeg\r\n\r\n", boundary, item.Key, fi.Name));
//                    stream.Write(EncodedPostParams, 0, EncodedPostParams.Length);
//                    EncodedPostParams = File.ReadAllBytes(fi.FullName);
//                    stream.Write(EncodedPostParams, 0, EncodedPostParams.Length);
//                    EncodedPostParams = this.Encoding.GetBytes("\r\n");
//                }
//                else if (item.Value == NetworkClient.REQUEST_RAW_DATA)
//                {
//                    EncodedPostParams = this.Encoding.GetBytes(String.Format("--{0}\r\n{1}", boundary, item.Key));
//                }
//                else
//                {
//                    EncodedPostParams = this.Encoding.GetBytes(String.Format("--{0}\r\nContent-Disposition: form-data; name=\"{1}\"\r\n\r\n{2}\r\n", boundary, item.Key, item.Value));
//                }
//                stream.Write(EncodedPostParams, 0, EncodedPostParams.Length);
//            }
//            EncodedPostParams = this.Encoding.GetBytes("--" + boundary + "--");
//            stream.Write(EncodedPostParams, 0, EncodedPostParams.Length);
//        }
//    }
//{  "is_facade": null,  "is_cover": null,  "comment": null,  "extension": "jpg",  "rotation": 0,  "id": "3789947162",  "position": 1,  "url": "/realty/photo/434debcd6662ff151a28008cbaf3153a",  "url_with_size": "https://n1st.ru/cache/realty/photo/434debcd6662ff151a28008cbaf3153a_%width%_%height%_%type%.jpg"}
}
