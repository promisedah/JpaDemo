package cn.org.yunmo.hotel.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class CstActivity {

    @Id
    @GeneratedValue
    private Integer atv_id;

    private String atv_cust_no;

    private Date atv_date;

    private String atv_place;

    private String atv_title;

    private String atv_desc;

    private String atv_flag;

    public Integer getAtv_id() {
        return atv_id;
    }

    public void setAtv_id(Integer atv_id) {
        this.atv_id = atv_id;
    }

    public String getAtv_cust_no() {
        return atv_cust_no;
    }

    public void setAtv_cust_no(String atv_cust_no) {
        this.atv_cust_no = atv_cust_no == null ? null : atv_cust_no.trim();
    }

    public Date getAtv_date() {
        return atv_date;
    }

    public void setAtv_date(Date atv_date) {
        this.atv_date = atv_date;
    }

    public String getAtv_place() {
        return atv_place;
    }

    public void setAtv_place(String atv_place) {
        this.atv_place = atv_place == null ? null : atv_place.trim();
    }

    public String getAtv_title() {
        return atv_title;
    }

    public void setAtv_title(String atv_title) {
        this.atv_title = atv_title == null ? null : atv_title.trim();
    }

    public String getAtv_desc() {
        return atv_desc;
    }

    public void setAtv_desc(String atv_desc) {
        this.atv_desc = atv_desc == null ? null : atv_desc.trim();
    }

    public String getAtv_flag() {
        return atv_flag;
    }

    public void setAtv_flag(String atv_flag) {
        this.atv_flag = atv_flag == null ? null : atv_flag.trim();
    }
}