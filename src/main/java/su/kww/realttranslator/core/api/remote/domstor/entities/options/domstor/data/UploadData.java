package su.kww.realttranslator.core.api.remote.domstor.entities.options.domstor.data;

import java.io.File;

public class UploadData {

    private String type;
    private String name;
    private File data;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public File getData() {
        return data;
    }

    public void setData(File data) {
        this.data = data;
    }
}
