package su.kww.realttranslator.core.api.inside.database.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//.Table("user_settings")
@Entity
@Table(name = "user_settings")
public class UserSettings {

//.WithColumn("id").AsInt64().PrimaryKey().Identity()
    @Id
    @Column(name = "id")
    private Long id;
//.WithColumn("key").AsString(255).NotNullable().Unique()
    @Column(name = "key", nullable = false, unique = true)
    private String key = "";
//.WithColumn("json").AsString(16777215).NotNullable();
    @Column(name = "json",length = 16777215,nullable = false)
    private String json = "";

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }
}
