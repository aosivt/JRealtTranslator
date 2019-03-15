package su.kww.realttranslator.core.api.remote.ngs.services;

import su.kww.realttranslator.core.api.remote.ngs.services.auth.AuthNgsBaseApiConfig;
import su.kww.realttranslator.core.api.remote.ngs.services.auth.request.NgsAuthRequest;
import su.kww.realttranslator.core.api.remote.ngs.services.auth.responce.NgsAuthResponce;
import su.kww.realttranslator.core.api.remote.ngs.services.process.ProcessNgsBaseApiConfig;

import javax.inject.Inject;

public class NgsApiConfig {

    @Inject
    AuthNgsBaseApiConfig authNgsBaseApiConfig;
    @Inject
    NgsAuthRequest ngsAuthRequest;
    @Inject
    ProcessNgsBaseApiConfig processNgsBaseApiConfig;


    private String token;

    private String responce;

    @Inject
    public NgsApiConfig(){}

    public NgsApiConfig auth(String username, String pass){

        ngsAuthRequest.setUsername(username);
        ngsAuthRequest.setPassword(pass);

        authNgsBaseApiConfig.postAuthNgs(ngsAuthRequest)
                            .doOnError(this::setResponce)
                            .subscribe(this::setToken)
                            .dispose();
        return this;
    }

    public NgsApiConfig add(String data){
        processNgsBaseApiConfig
                .setToken(token)
                .add(data)
                .doOnError(this::setResponce)
                .subscribe(this::setResponce).dispose();
        return this;
    }

    private void setResponce(Object o) {
        responce = o.toString();
    }


    private void setToken(NgsAuthResponce ngsAuthResponce) {
        token = ngsAuthResponce.getResult().getUser().getToken().getAccess();
    }

    public String getToken(){
        return token;
    }

    public String getResponce(){
        return responce;
    }



}
