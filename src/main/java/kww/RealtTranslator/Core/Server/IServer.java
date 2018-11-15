package kww.RealtTranslator.Core.Server;

import kww.RealtTranslator.Core.Entity.Advert;
import kww.RealtTranslator.Core.Entity.MailerPreset;
import kww.RealtTranslator.Core.Entity.Site;

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
