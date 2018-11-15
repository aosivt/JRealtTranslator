package kww.RealtTranslator.Core.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "mailer_preset")
public class MailerPreset {

    //.WithColumn("id").AsInt32().PrimaryKey()
    @Id
    @Column(name = "id")
    private Integer id;
    //.WithColumn("host").AsString(255).NotNullable()
    @Column(name = "host", nullable = false)
    private String host;
    //.WithColumn("smtp").AsString(255).NotNullable()
    @Column(name = "smtp", nullable = false)
    private String smtp;
    //.WithColumn("port").AsInt32().NotNullable()
    @Column(name = "port")
    private Integer port = 1;
    //.WithColumn("ssl").AsInt32().NotNullable()
    @Column(name = "ssl")
    private Integer ssl = 1;
    //.WithColumn("title").AsString(255).NotNullable()
    @Column(name = "title", nullable = false)
    private String title;
    //.WithColumn("updatedAt").AsDateTime().NotNullable()
    @Column(name = "update_at", nullable = false)
    private Date updateAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getSmtp() {
        return smtp;
    }

    public void setSmtp(String smtp) {
        this.smtp = smtp;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Integer getSsl() {
        return ssl;
    }

    public void setSsl(Integer ssl) {
        this.ssl = ssl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }
}
