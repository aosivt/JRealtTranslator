package su.kww.realttranslator.core.api.remote.ngs;

import dagger.Component;
import su.kww.realttranslator.core.api.remote.ngs.services.NgsApiConfig;

@Component
public interface NgsComponent {
    NgsApiConfig getNgsApiConfig();
}
