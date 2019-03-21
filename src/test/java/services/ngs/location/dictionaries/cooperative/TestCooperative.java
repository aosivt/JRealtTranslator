package services.ngs.location.dictionaries.cooperative;

import io.reactivex.Observable;
import org.junit.Test;
import su.kww.realttranslator.core.api.remote.ngs.DaggerNgsComponent;
import su.kww.realttranslator.core.api.remote.ngs.services.dictionaries.respose.NgsDictionaryResponse;
import su.kww.realttranslator.core.api.remote.ngs.services.dictionaries.cooperative.response.NgsCooperativeResponse;
import su.kww.realttranslator.core.api.remote.ngs.services.dictionaries.developer.response.NgsDeveloperResponse;

public class TestCooperative {

//    static {
//        System.setProperty("http.proxyHost", "127.0.0.1");
//        System.setProperty("https.proxyHost", "127.0.0.1");
//        System.setProperty("http.proxyPort", "8888");
//        System.setProperty("https.proxyPort", "8888");
//    }

    @Test
    public void testCooperative(){
        Observable<NgsDictionaryResponse> developers =
        DaggerNgsComponent.create().getNgsApiConfig().getCooperativeService().getNgsCooperative(54,0);
        developers.doOnError(this::error).subscribe(this::response).dispose();
    }

    private void error(Throwable throwable) {
        System.out.println(throwable.getMessage());
    }

    private void response(NgsDictionaryResponse ngsDictionaryResponse) {
        System.out.println(((NgsDeveloperResponse)ngsDictionaryResponse).getResult());
    }



}
