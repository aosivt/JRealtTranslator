package domstor.remote;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import org.junit.Before;
import org.junit.Test;
import retrofit2.Response;
import su.kww.realttranslator.core.api.remote.domstor.DaggerDomstorComponent;
import su.kww.realttranslator.core.api.remote.domstor.DomstorUsernamePassword;
import su.kww.realttranslator.core.api.remote.domstor.UserNamePassword;
import su.kww.realttranslator.core.api.remote.domstor.services.DomstorApiConfig;
import su.kww.realttranslator.core.api.remote.ngs.DaggerNgsComponent;
import su.kww.realttranslator.core.api.remote.ngs.services.request.NgsAuthRequest;
import su.kww.realttranslator.core.api.remote.ngs.services.responce.auth.NgsAuthResponce;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestDownloadPhoto {

    private DomstorApiConfig domstorApiConfig;
    private String TEST_PHOTO_URL;
    private String TEST_USER;
    private String TEST_PASSWORD;
    private UserNamePassword userNamePassword;
    private Method methodDownloadPhoto;

    @Before
    public void setup() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        domstorApiConfig = DaggerDomstorComponent.builder().build().getDomstorApiConfig();
        TEST_PHOTO_URL = "http://static.domstor.ru/photo//43_LIV/2004//AG_1/430000000000001.JPG";
        TEST_USER = "alx";
        TEST_PASSWORD = "123";
        userNamePassword = new DomstorUsernamePassword(TEST_USER,TEST_PASSWORD);

        methodDownloadPhoto = DomstorApiConfig.class.getDeclaredMethod("downloadPhoto", Response.class, String.class);
        methodDownloadPhoto.setAccessible(true);
    }

    @Test
    public void testDownload(){
        Observable<Response<ResponseBody>> resp = domstorApiConfig.downloadPhotoByUrl(TEST_PHOTO_URL);
        resp.subscribe(r->methodDownloadPhoto.invoke(domstorApiConfig
                                                     ,r
                                                     ,String.format(".JRealtTranslator/%s_%s/","3","234")));
    }





}
