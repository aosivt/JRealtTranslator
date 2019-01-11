package su.kww.realttranslator.core.api.remote.domstor.entities.links;

import com.fasterxml.jackson.annotation.JsonProperty;

    public class LinksSiteJson {

        @JsonProperty("SiteId")
        private Object siteId;
        @JsonProperty("Type")
        private Object type;
        @JsonProperty("DomstorId")
        private Object domstorId;
        @JsonProperty("Operation")
        private Object operation;
        @JsonProperty("Loaded")
        private Object loaded;
        @JsonProperty("ExternalId")
        private Object externalId;
        @JsonProperty("AdvertEditDate")
        private Object advertEditDate;
        @JsonProperty("Version")
        private Object version;
        @JsonProperty("ExternalUrl")
        private Object externalUrl;

        public Object getSiteId() {
            return siteId;
        }

        public Object getType() {
            return type;
        }

        public Object getDomstorId() {
            return domstorId;
        }

        public Object getOperation() {
            return operation;
        }

        public Object getLoaded() {
            return loaded;
        }

        public Object getExternalId() {
            return externalId;
        }

        public Object getAdvertEditDate() {
            return advertEditDate;
        }

        public Object getVersion() {
            return version;
        }

        public Object getExternalUrl() {
            return externalUrl;
        }
    }
