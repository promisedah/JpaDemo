package cn.org.yunmo.hotel.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SysRoleRight {

    @Id
    @GeneratedValue
    private Integer rf_id;

    private Integer rf_role_id;

    private String rf_right_code;

    public Integer getRf_id() {
        return rf_id;
    }

    public void setRf_id(Integer rf_id) {
        this.rf_id = rf_id;
    }

    public Integer getRf_role_id() {
        return rf_role_id;
    }

    public void setRf_role_id(Integer rf_role_id) {
        this.rf_role_id = rf_role_id;
    }

    public String getRf_right_code() {
        return rf_right_code;
    }

    public void setRf_right_code(String rf_right_code) {
        this.rf_right_code = rf_right_code == null ? null : rf_right_code.trim();
    }
}