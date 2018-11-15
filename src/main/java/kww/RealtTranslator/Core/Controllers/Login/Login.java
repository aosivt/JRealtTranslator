package kww.RealtTranslator.Core.Controllers.Login;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import io.reactivex.Observable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import kww.RealtTranslator.Core.Api.Interfaces.IUserNamePassword;
import kww.RealtTranslator.Core.Api.ServiceEntities.LoginService.LoginApi;
import kww.RealtTranslator.Core.Api.ServiceEntities.LoginService.LoginEntity;
import okhttp3.Credentials;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Objects;

/**
 *
 * @author villan
 */
public class Login extends AbstractLogin implements Initializable {

    private static Observable<LoginEntity> observLoginEntity;


    @FXML
    void makeLogin(ActionEvent event) {
        IUserNamePassword userNamePassword = auth();
        if (Objects.isNull(userNamePassword)) {
            fieldMessage(EMPTY_USER_PASSWORD);
            return;
        }

        LoginApi loginApi = testConnection(userNamePassword).create(LoginApi.class);
//        Call<LoginEntity> loginEntityCall = loginApi.getData();

        loginApi.getData().firstOrError()
                .doOnError(e->fieldMessage(ERROR_USER_PASSWORD + e.getMessage()))
                .subscribe(loginEntity -> getMain().setUserName(loginEntity.getAgencyName()))
                .dispose();

        getMain().setUsernamePassword(userNamePassword);

    }

    @FXML
    void actionForgotPassword(ActionEvent event) {
        try {
            Desktop.getDesktop().browse(new URL("http://domstor.ru/restore/").toURI());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    private Retrofit testConnection(final IUserNamePassword userNamePassword){
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .authenticator((route, response) -> {
                    Request request = response.request();
                    if (request.header("Authorization") != null)
                        // Логин и пароль неверны
                        return null;
                    return request.newBuilder()
                            .header("Authorization", Credentials.basic(userNamePassword.getUsername(), userNamePassword.getPassword()))
                            .build();
                })
                .build();

        return new Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl("http://api.domstor.ru/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }
}
