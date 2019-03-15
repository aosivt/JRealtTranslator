package services.ngs.process.add;

import org.junit.Before;
import org.junit.Test;
import su.kww.realttranslator.core.api.remote.ngs.DaggerNgsComponent;
import su.kww.realttranslator.core.api.remote.ngs.services.NgsApiConfig;
import su.kww.realttranslator.core.api.remote.ngs.services.auth.request.NgsAuthRequest;
import su.kww.realttranslator.core.api.remote.ngs.services.auth.responce.NgsAuthResponce;

import static org.junit.Assert.*;

public class TestProcessAdd {
    NgsAuthRequest ngsAuthRequest;

    String dataForNgsForm;
    String token;
    private String pass = "0305tdf";
    private String user = "rcn3120240@mail.ru";
    String url = "https://novosibirsk.n1.ru/api/rn/v2/offers/homes/?isPreview=0";
    String temp = "https://kemerovo.n1.ru/api/rn/v2/cities/?fields%5B0%5D=id&fields%5B1%5D=name&fields%5B2%5D=area_id&fields%5B3%5D=area_name&region_id=54&limit=0";
    String responce = "{\"result\":[{\"id\":\"291256492\",\"success_url\":\"\\/cabinet\\/billing\\/order\\/user\\/?project=realty&selected[0][type]=kd&selected_offers_hash=06a5383ae139d597be904d8968fe2b87\",\"payment_type\":\"commercial\",\"error\":null,\"offer\":null}],\"metadata\":{\"resultset\":{\"count\":5,\"limit\":0,\"offset\":0}}}";
    @Before
    public void setAuthData(){
        ngsAuthRequest = new NgsAuthRequest();
        ngsAuthRequest.setUsername("rcn3120240@mail.ru");
        ngsAuthRequest.setPassword("0305tdf");
        ngsAuthRequest.setType("password");
        dataForNgsForm = getDataForNgsForm();
   }


    @Test
    public void testProcess(){
        assertAddDataToNgs();
    }

    private void assertAddDataToNgs(){
        NgsApiConfig ngsApiConfig = DaggerNgsComponent.create().getNgsApiConfig();


        String t = ngsApiConfig.auth(user,pass).add(dataForNgsForm).getResponce();

        assertNotNull(t);
    }


    private void exception(Throwable throwable) {
        System.out.println(throwable.getMessage());
    }

    private void  checkLogin(NgsAuthResponce login){
        System.out.println(login);
        token = login.getResult().getUser().getToken().getAccess();
    }

    private void checkPostToNgs(Object resp){
        System.out.println(resp);
    }

    private String getDataForNgsForm(){
        return "{\"rubric\": \"homes\",\"deal_type\": \"sell\",\"price\": \"650000\",\"photos\": [],\"description\": \"В продаже полноценная 2-х комнатная квартира, (Чулым 3). Квартира чистая, светлая, теплая. Окна по всей квартиры пластиковые, новая входная дверь. Реальному покупателю торг.\",\"contacts\": {     \"person\": \"Алена Александровна\",     \"organization_name\": \"Агентство недвижимости «Новосибирск Недвижимость»\",     \"phones\": [       {         \"value\": \"89137707563\",         \"comment\": \"\"       }     ],     \"email\": \"nn2633262@mail.ru\",     \"address\": \"г. Новосибирск, Немировича -Данченко, 104\"   },\"is_net_sale\": true,\"is_exchange\": false,\"is_pawn\": false,\"is_deposit\": false,\"is_mortgage\": false,\"agency_code\": null,\"house\": {     \"material_type\": {       \"id\": \"374\"     }   },\"geo\": {     \"city\": {       \"id\": 2263012,       \"name\": \"Чулым-3\"     },     \"district\": null,     \"micro_district\": null,     \"street\": {       \"id\": 16071352,       \"name\": \"Центральная\"     },     \"house_number\": \"12\",     \"region\": {       \"id\": 54     }   },\"rent_duration_type\": {     \"id\": \"544\"   },\"total_area\": 41.2,\"living_area\": 24.8,\"kitchen_area\": 5.0,\"floor\": 1,\"floors_count\": 2,\"loggia_count\": null,\"balcony_count\": null,\"type\": {     \"id\": \"100000000\"   },\"layout_type\": {     \"id\": \"395\"   },\"condition_type\": {     \"id\": \"163128\"   },\"ownership_type\": {     \"id\": \"422\"   },\"wc_type\": {     \"id\": \"400\"   },\"rooms_count_type\": {\"id\": \"367\"   } }";
    }

}
