package su.kww.realttranslator.core.api.inside.database.entities;

import su.kww.realttranslator.core.api.inside.database.entities.identifiers.AdvertId;
import su.kww.realttranslator.core.api.inside.database.entities.interfaces.EntityDomstor;

import javax.persistence.*;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "advert")
//@IdClass(AdvertId.class)
public class Advert implements EntityDomstor {

//                .WithColumn("data_type").AsInt32().NotNullable()
    @Id
    @Column(name = "data_type", nullable = false)
    private Integer dataType;
//                .WithColumn("domstor_id").AsInt64().NotNullable();
    @Id
    @Column(name = "domstor_id", nullable = false)
    private Long domstorId;
//                .WithColumn("server_date").AsDateTime().NotNullable()
    @Column(name = "server_date", nullable = false)
    private Date serverDate;
//    AddColumn("edit_date").AsDateTime().Nullable();
    @Column(name = "edit_date")
    private Date editDate;
//                .WithColumn("is_rent").AsBoolean().NotNullable()
    @Column(name = "is_rent", nullable = false)
    private Boolean isRent = false;
//                .WithColumn("is_sale").AsBoolean().NotNullable()
    @Column(name = "is_sale", nullable = false)
    private Boolean isSale = false;
//                .WithColumn("json").AsString(16777215).NotNullable()
    @Column(name = "json", length = 16777215, nullable = false)
    private String json;
//                .AddColumn("deleted").AsBoolean().WithDefaultValue(false)
    @Column(name = "deleted", nullable = false)
    private Boolean deleted = false;

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
