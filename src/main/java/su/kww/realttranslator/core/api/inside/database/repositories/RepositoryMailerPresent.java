package su.kww.realttranslator.core.api.inside.database.repositories;

import su.kww.realttranslator.core.api.inside.database.entities.AdvertSiteUpdate;
import su.kww.realttranslator.core.api.inside.database.entities.MailerPreset;
import su.kww.realttranslator.core.api.remote.domstor.entities.links.LinksSiteJson;
import su.kww.realttranslator.core.api.remote.domstor.entities.mailer.MailerPresentsEntity;

public class RepositoryMailerPresent extends AbstractRepository{

    public static MailerPreset create(MailerPresentsEntity mailerPresentsEntity){
        MailerPreset mailerPreset = new MailerPreset();
        mailerPreset.setHost(mailerPresentsEntity.getHost());
        mailerPreset.setPort(mailerPresentsEntity.getPort());
        mailerPreset.setSmtp(mailerPresentsEntity.getSmtp());
        mailerPreset.setSsl(mailerPresentsEntity.getSsl());
        mailerPreset.setTitle(mailerPresentsEntity.getTitle());
        mailerPreset.setUpdateAt(mailerPresentsEntity.getUpdatedAt());
        return mailerPreset;
    }
}
