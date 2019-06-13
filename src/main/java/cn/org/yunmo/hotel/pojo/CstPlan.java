package cn.org.yunmo.hotel.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class CstPlan {

    @Id
    @GeneratedValue
    private Integer pla_id;

    private Integer pla_chc_id;

    private Date pla_date;

    private String pla_todo;

    private String pla_result;

    private String pla_flag;

    public Integer getPla_id() {
        return pla_id;
    }

    public void setPla_id(Integer pla_id) {
        this.pla_id = pla_id;
    }

    public Integer getPla_chc_id() {
        return pla_chc_id;
    }

    public void setPla_chc_id(Integer pla_chc_id) {
        this.pla_chc_id = pla_chc_id;
    }

    public Date getPla_date() {
        return pla_date;
    }

    public void setPla_date(Date pla_date) {
        this.pla_date = pla_date;
    }

    public String getPla_todo() {
        return pla_todo;
    }

    public void setPla_todo(String pla_todo) {
        this.pla_todo = pla_todo == null ? null : pla_todo.trim();
    }

    public String getPla_result() {
        return pla_result;
    }

    public void setPla_result(String pla_result) {
        this.pla_result = pla_result == null ? null : pla_result.trim();
    }

    public String getPla_flag() {
        return pla_flag;
    }

    public void setPla_flag(String pla_flag) {
        this.pla_flag = pla_flag == null ? null : pla_flag.trim();
    }
}