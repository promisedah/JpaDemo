package cn.org.yunmo.hotel.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Schedule {

    @Id
    @GeneratedValue
    private Integer sch_id;

    private Integer sch_user_id;

    private String sch_name;

    private String sch_context;

    private Date sch_date;

    private String sch_flag;

    public Integer getSch_id() {
        return sch_id;
    }

    public void setSch_id(Integer sch_id) {
        this.sch_id = sch_id;
    }

    public Integer getSch_user_id() {
        return sch_user_id;
    }

    public void setSch_user_id(Integer sch_user_id) {
        this.sch_user_id = sch_user_id;
    }

    public String getSch_name() {
        return sch_name;
    }

    public void setSch_name(String sch_name) {
        this.sch_name = sch_name == null ? null : sch_name.trim();
    }

    public String getSch_context() {
        return sch_context;
    }

    public void setSch_context(String sch_context) {
        this.sch_context = sch_context == null ? null : sch_context.trim();
    }

    public Date getSch_date() {
        return sch_date;
    }

    public void setSch_date(Date sch_date) {
        this.sch_date = sch_date;
    }

    public String getSch_flag() {
        return sch_flag;
    }

    public void setSch_flag(String sch_flag) {
        this.sch_flag = sch_flag == null ? null : sch_flag.trim();
    }
}