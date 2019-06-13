package cn.org.yunmo.hotel.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Message {

    @Id
    @GeneratedValue
    private Integer msg_id;

    private Integer msg_send_user_id;

    private Integer msg_receive_user_id;

    private String msg_param;

    private Date msg_send_date;

    private Date msg_receive_date;

    private String msg_status;

    private String msg_flag;

    public Integer getMsg_id() {
        return msg_id;
    }

    public void setMsg_id(Integer msg_id) {
        this.msg_id = msg_id;
    }

    public Integer getMsg_send_user_id() {
        return msg_send_user_id;
    }

    public void setMsg_send_user_id(Integer msg_send_user_id) {
        this.msg_send_user_id = msg_send_user_id;
    }

    public Integer getMsg_receive_user_id() {
        return msg_receive_user_id;
    }

    public void setMsg_receive_user_id(Integer msg_receive_user_id) {
        this.msg_receive_user_id = msg_receive_user_id;
    }

    public String getMsg_param() {
        return msg_param;
    }

    public void setMsg_param(String msg_param) {
        this.msg_param = msg_param == null ? null : msg_param.trim();
    }

    public Date getMsg_send_date() {
        return msg_send_date;
    }

    public void setMsg_send_date(Date msg_send_date) {
        this.msg_send_date = msg_send_date;
    }

    public Date getMsg_receive_date() {
        return msg_receive_date;
    }

    public void setMsg_receive_date(Date msg_receive_date) {
        this.msg_receive_date = msg_receive_date;
    }

    public String getMsg_status() {
        return msg_status;
    }

    public void setMsg_status(String msg_status) {
        this.msg_status = msg_status == null ? null : msg_status.trim();
    }

    public String getMsg_flag() {
        return msg_flag;
    }

    public void setMsg_flag(String msg_flag) {
        this.msg_flag = msg_flag == null ? null : msg_flag.trim();
    }
}