package cn.org.yunmo.hotel.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class SysUser {

    @Id
    @GeneratedValue
    private Integer usr_id;

    private String usr_name;

    private String usr_password;

    private Integer usr_role_id;

    private String usr_flag;

    @Transient//排除
	private SysRole sysRole;

    public Integer getUsr_id() {
        return usr_id;
    }

    public void setUsr_id(Integer usr_id) {
        this.usr_id = usr_id;
    }

    public String getUsr_name() {
        return usr_name;
    }

    public void setUsr_name(String usr_name) {
        this.usr_name = usr_name == null ? null : usr_name.trim();
    }

    public String getUsr_password() {
        return usr_password;
    }

    public void setUsr_password(String usr_password) {
        this.usr_password = usr_password == null ? null : usr_password.trim();
    }

    public Integer getUsr_role_id() {
        return usr_role_id;
    }

    public void setUsr_role_id(Integer usr_role_id) {
        this.usr_role_id = usr_role_id;
    }

    public String getUsr_flag() {
        return usr_flag;
    }

    public void setUsr_flag(String usr_flag) {
        this.usr_flag = usr_flag == null ? null : usr_flag.trim();
    }

	@Override
	public String toString() {
		return "SysUser [usr_id=" + usr_id + ", usr_name=" + usr_name + ", usr_password=" + usr_password
				+ ", usr_role_id=" + usr_role_id + ", usr_flag=" + usr_flag + "]";
	}

	public SysRole getSysRole() {
		return sysRole;
	}

	public void setSysRole(SysRole sysRole) {
		this.sysRole = sysRole;
	}
}