package su.kww.realttranslator.core.api.remote.ngs;

import dagger.Component;
import su.kww.realttranslator.core.api.remote.ngs.services.NgsApiconfig;

@Component
public interface NgsComponent {
    NgsApiconfig getNgsApiConfig();
}
