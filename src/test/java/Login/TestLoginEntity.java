package Login;

import com.google.gson.Gson;
import com.sun.jersey.api.client.*;
import su.kww.realttranslator.core.api.remote.domstor.entities.login.LoginEntity;
import org.junit.*;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class TestLoginEntity {

    private String user = "alx";
    private String pass = "123";
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before CalculatorTest.class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After CalculatorTest.class");
    }

    @Before
    public void initTest() {
//        requestAllJson = new Calculator();
    }

    @After
    public void afterTest() {

    }


    @Test
    public void testGetResultFromAllJsonService(){

        WebResource resource = Client.create().resource("http://api.domstor.ru/rt/login.json");
        WebResource.Builder builder = resource.accept(MediaType.APPLICATION_JSON)
                .type(MediaType.APPLICATION_JSON)
                .header(HttpHeaders.AUTHORIZATION, getBasicAuthentication());
        LoginEntity returnValue = null;
        try {
            returnValue = builder.post(LoginEntity.class);
        }
        catch (ClientHandlerException exception){
            throw new ClientHandlerException("");
        } catch (UniformInterfaceException ue){
            ue.getResponse().getLength();
        }
        System.out.println(returnValue);
    }
    private String getBasicAuthentication() {
        String token = this.user + ":" + this.pass;
        try {
            Base64.Encoder encoder = Base64.getEncoder();
            return "Basic  " + encoder.encodeToString(token.getBytes("UTF-8"));

        } catch (UnsupportedEncodingException ex) {
            throw new IllegalStateException("Cannot encode with UTF-8", ex);
        }
    }
}
