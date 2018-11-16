package kww.RealtTranslator.Core.Server;

import su.kww.realttranslator.core.api.inside.database.entities.Advert;
import su.kww.realttranslator.core.api.inside.database.entities.MailerPreset;
import su.kww.realttranslator.core.api.inside.database.entities.Site;

import java.util.Collection;

public interface IServer {
    public void authenticate();

//    public IUserConfig getUserConfig();

    public Collection<Site> getSites();

    public Collection<MailerPreset> getMailerPresets();

    public Collection<Advert> getAdverts();

//    public Collection<LinkData> getLinkData();
//
//    public Collection<ReferenceItem> getReferenceData(int site_id);

    public UploadResult upload(UploadData data);
}
