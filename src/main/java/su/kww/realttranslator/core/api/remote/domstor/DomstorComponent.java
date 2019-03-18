package su.kww.realttranslator.core.api.remote.domstor;

import dagger.Component;
import su.kww.realttranslator.core.api.remote.domstor.services.DomstorApiConfig;

@Component
public interface DomstorComponent {
    DomstorApiConfig getDomstorApiConfig();
}
