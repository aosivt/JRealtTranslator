package kww.RealtTranslator.Core.Server;

import com.sun.jersey.api.client.*;
import su.kww.realttranslator.core.api.remote.domstor.services.UrlConfig;
import su.kww.realttranslator.core.api.inside.database.entities.Advert;
import su.kww.realttranslator.core.api.inside.database.entities.MailerPreset;
import su.kww.realttranslator.core.api.inside.database.entities.Site;
import sun.net.NetworkClient;

import javax.ws.rs.core.MediaType;
import java.util.Collection;

public class AbstractServer implements IServer {

    protected UrlConfig apiConfig;
    protected IAuthToken<String> token;
    protected NetworkClient client = new NetworkClient();

    @Override
    public void authenticate() {

    }

    @Override
    public Collection<Site> getSites() {
        return null;
    }

    @Override
    public Collection<MailerPreset> getMailerPresets() {
        return null;
    }

    @Override
    public Collection<Advert> getAdverts() {
        return null;
    }

    @Override
    public UploadResult upload(UploadData data) {
        return null;
    }

    protected String makeRequest(String url)
    {
        WebResource resource = Client.create().resource(url);
        applyToken(resource);
        WebResource.Builder builder = resource.accept(MediaType.APPLICATION_JSON)
                .type(MediaType.APPLICATION_JSON);
        ClientResponse temp  = builder.post(ClientResponse.class);
        return temp.getEntity(String.class).replaceAll("},]","}]");
    }

    protected String readUrl(String url) {
//        try {
            return makeRequest(url);
//        } catch (UniformInterfaceException ex) {
//            this.token = null;
//            if (ex.get Status == WebExceptionStatus.ProtocolError)
//            {
//                HttpWebResponse response = (HttpWebResponse)ex.Response;
//                if (response.StatusCode != HttpStatusCode.Unauthorized)
//                {
//                    if (response.StatusCode == HttpStatusCode.Forbidden)
//                    {
//                        string msg;
//                        using (Stream stream = response.GetResponseStream())
//                        {
//                            using (StreamReader reader = new StreamReader(stream))
//                            {
//                                msg = reader.ReadToEnd();
//                            }
//                        }
//                        throw new AuthentificationFailException(msg, ex);
//                    }
//                    else
//                    {
//                        throw new AuthentificationFailException("Ошибка сервера", ex);
//                    }
//
//                }
//                else
//                {
//                    throw new AuthentificationFailException("Неверный логин или пароль", ex);
//                }
//            }
//            else
//            {
//                throw new AuthentificationFailException(ex.Message, ex);
//            }
        }
    protected void applyToken(WebResource resource) { }
}

