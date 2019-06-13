package cn.org.yunmo.hotel.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Notice {

    @Id
    @GeneratedValue
    private Integer notId;

    private Integer notUserId;

    private String notParam;

    private Date notCreatedate;

    private String notFlag;

    public Integer getNotId() {
        return notId;
    }

    public void setNotId(Integer notId) {
        this.notId = notId;
    }

    public Integer getNotUserId() {
        return notUserId;
    }

    public void setNotUserId(Integer notUserId) {
        this.notUserId = notUserId;
    }

    public String getNotParam() {
        return notParam;
    }

    public void setNotParam(String notParam) {
        this.notParam = notParam == null ? null : notParam.trim();
    }

    public Date getNotCreatedate() {
        return notCreatedate;
    }

    public void setNotCreatedate(Date notCreatedate) {
        this.notCreatedate = notCreatedate;
    }

    public String getNotFlag() {
        return notFlag;
    }

    public void setNotFlag(String notFlag) {
        this.notFlag = notFlag == null ? null : notFlag.trim();
    }
}