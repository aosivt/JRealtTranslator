package su.kww.realttranslator.translators.builders.service;

import io.reactivex.Observable;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import su.kww.realttranslator.core.api.remote.domstor.DaggerDomstorComponent;
import su.kww.realttranslator.core.api.remote.domstor.UserNamePassword;
import su.kww.realttranslator.core.api.remote.domstor.entities.options_domstor_data.UploadResult;

import java.io.File;

public abstract class AbstractTranslatorService implements TranslatorService{

    @Override
    public String getFeedSite() {
        return String.format("%s.%s",getSiteKey(),getSiteFormat());
    }

    protected void uploadOnServer(UserNamePassword usernamePassword){
        File file = new File(getFeedSite());
        RequestBody requestBody = RequestBody.create(MediaType.parse("*/*"), file);
        MultipartBody.Part fileToUpload = MultipartBody.Part.createFormData("data", file.getName(), requestBody);
        RequestBody filename = RequestBody.create(MediaType.parse("text/plain"), file.getName());

        Observable<UploadResult> resultObservable =  DaggerDomstorComponent.create().getDomstorApiConfig()
                .setUserNamePassword(usernamePassword)
                .postDomstorData(fileToUpload, filename);

        resultObservable
                .doOnError(e->e.getMessage())
                .subscribe(System.out::print).dispose();
    }
}
