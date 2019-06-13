package cn.org.yunmo.hotel.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class VipInfo {

    @Id
    @GeneratedValue
    private Integer vip_id;

    private Integer user_id;

    private String vip_cardno;

    private String vip_name;

    private Double balance;

    private Date begin_time;

    private Double accumulated_recharge;

    private Double gift_summoney;

    private String grade;

    public Integer getVip_id() {
        return vip_id;
    }

    public void setVip_id(Integer vip_id) {
        this.vip_id = vip_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getVip_cardno() {
        return vip_cardno;
    }

    public void setVip_cardno(String vip_cardno) {
        this.vip_cardno = vip_cardno == null ? null : vip_cardno.trim();
    }

    public String getVip_name() {
        return vip_name;
    }

    public void setVip_name(String vip_name) {
        this.vip_name = vip_name == null ? null : vip_name.trim();
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Date getBegin_time() {
        return begin_time;
    }

    public void setBegin_time(Date begin_time) {
        this.begin_time = begin_time;
    }

    public Double getAccumulated_recharge() {
        return accumulated_recharge;
    }

    public void setAccumulated_recharge(Double accumulated_recharge) {
        this.accumulated_recharge = accumulated_recharge;
    }

    public Double getGift_summoney() {
        return gift_summoney;
    }

    public void setGift_summoney(Double gift_summoney) {
        this.gift_summoney = gift_summoney;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }
}