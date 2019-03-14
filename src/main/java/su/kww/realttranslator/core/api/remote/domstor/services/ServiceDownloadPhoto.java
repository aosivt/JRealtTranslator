package su.kww.realttranslator.core.api.remote.domstor.services;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import okio.BufferedSink;
import okio.Okio;
import retrofit2.Response;
import retrofit2.Retrofit;
import su.kww.realttranslator.core.api.remote.domstor.entities.ServiceAllJson;

import javax.inject.Inject;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.Function;

public class ServiceDownloadPhoto extends BaseApiConfig implements ServiceDownloadPhotoConfig {

    private static final String FORMAT_PATH_PHOTOS = ".JRealtTranslator/%s_%s/";

    @Inject
    public ServiceDownloadPhoto(){}

    public Function<ServiceAllJson,ServiceAllJson> downloadPhotos = (allJsonData) -> {
        allJsonData.getPhotos().forEach(fileNamePhoto ->
            downloadPhotoByUrl(fileNamePhoto)
                    .doOnError(e->System.out.println(e.getMessage()))
                    .subscribe(
                        r->downloadPhoto(r,String.format(FORMAT_PATH_PHOTOS
                            ,allJsonData.getDataClass(),allJsonData.getId())))
        );
        return allJsonData;
    };

    private void downloadPhoto(final Response<ResponseBody> response,final String imagePath){
        try {
            List<String> segmentsUrl = response.raw().request().url().pathSegments();
            String fileNameImage = segmentsUrl.get(segmentsUrl.size()-1);
            if (!Files.exists(Paths.get(imagePath))) Files.createDirectory(Paths.get(imagePath));
            if (Files.exists(Paths.get(imagePath.concat(fileNameImage)))) return;
            File desinationFile = new File(imagePath.concat(fileNameImage));
            BufferedSink bufferedSink = Okio.buffer(Okio.sink(desinationFile));
            bufferedSink.writeAll(response.body().source());
            bufferedSink.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(123);
    }

    private Retrofit getRetrofitForBasePhotoUrl(){
        return getRetrofitByUrl(basePhotoUrl);
    }

    @Override
    public Observable<Response<ResponseBody>> downloadPhotoByUrl(String photoUrl) {
        return getRetrofitForBasePhotoUrl().create(ServiceDownloadPhotoConfig.class).downloadPhotoByUrl(photoUrl);
    }
}
