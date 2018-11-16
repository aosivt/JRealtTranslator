package su.kww.realttranslator.core.api.inside.database.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "advert")
public class Advert {

//                .WithColumn("id").AsInt32().PrimaryKey().Identity()
    @Id
    @Column(name = "id")
    private Integer id;
//                .WithColumn("server_date").AsDateTime().NotNullable()
    @Column(name = "server_date", nullable = false)
    private Date serverDate;
//    AddColumn("edit_date").AsDateTime().Nullable();
    @Column(name = "edit_date")
    private Date editDate;
//                .WithColumn("data_type").AsInt32().NotNullable()
    @Column(name = "data_type", nullable = false)
    private Integer dataType;
//                .WithColumn("is_rent").AsBoolean().NotNullable()
    @Column(name = "is_rent", nullable = false)
    private Boolean isRent = false;
//                .WithColumn("is_sale").AsBoolean().NotNullable()
    @Column(name = "is_sale", nullable = false)
    private Boolean isSale = false;
//                .WithColumn("json").AsString(16777215).NotNullable()
    @Column(name = "json", length = 16777215, nullable = false)
    private String json;
//                .WithColumn("domstor_id").AsInt64().NotNullable();
    @Column(name = "domstor_id", nullable = false)
    private Long domstorId;

//                .AddColumn("deleted").AsBoolean().WithDefaultValue(false)
    @Column(name = "deleted", nullable = false)
    private Boolean deleted = false;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getServerDate() {
        return serverDate;
    }

    public void setServerDate(Date serverDate) {
        this.serverDate = serverDate;
    }

    public Integer getDataType() {
        return dataType;
    }

    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }

    public Boolean getRent() {
        return isRent;
    }

    public void setRent(Boolean rent) {
        isRent = rent;
    }

    public Boolean getSale() {
        return isSale;
    }

    public void setSale(Boolean sale) {
        isSale = sale;
    }

    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }

    public Long getDomstorId() {
        return domstorId;
    }

    public void setDomstorId(Long domstorId) {
        this.domstorId = domstorId;
    }
}
