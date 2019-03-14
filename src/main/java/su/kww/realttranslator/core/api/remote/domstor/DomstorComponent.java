package su.kww.realttranslator.core.api.remote.domstor;

import dagger.Component;
import su.kww.realttranslator.core.api.remote.domstor.services.DomstorApiConfig;
import su.kww.realttranslator.core.api.remote.domstor.services.ServiceDownloadPhoto;

@Component
public interface DomstorComponent {
    DomstorApiConfig getDomstorApiConfig();
}
