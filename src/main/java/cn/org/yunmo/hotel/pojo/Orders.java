package cn.org.yunmo.hotel.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Orders {

    @Id
    @GeneratedValue
    private Integer odr_id;

    private String odr_customer_no;

    private Date odr_date;

    private String odr_addr;

    private String odr_status;

    public Integer getOdr_id() {
        return odr_id;
    }

    public void setOdr_id(Integer odr_id) {
        this.odr_id = odr_id;
    }

    public String getOdr_customer_no() {
        return odr_customer_no;
    }

    public void setOdr_customer_no(String odr_customer_no) {
        this.odr_customer_no = odr_customer_no == null ? null : odr_customer_no.trim();
    }

    public Date getOdr_date() {
        return odr_date;
    }

    public void setOdr_date(Date odr_date) {
        this.odr_date = odr_date;
    }

    public String getOdr_addr() {
        return odr_addr;
    }

    public void setOdr_addr(String odr_addr) {
        this.odr_addr = odr_addr == null ? null : odr_addr.trim();
    }

    public String getOdr_status() {
        return odr_status;
    }

    public void setOdr_status(String odr_status) {
        this.odr_status = odr_status == null ? null : odr_status.trim();
    }
}