package cn.org.yunmo.hotel.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SysRight {

    @Id
    @GeneratedValue
    private String right_code;

    private String right_parent_code;

    private String right_name;

    private String right_url;

    private String right_node_type;

    private String right_flag;

    public String getRight_code() {
        return right_code;
    }

    public void setRight_code(String right_code) {
        this.right_code = right_code == null ? null : right_code.trim();
    }

    public String getRight_parent_code() {
        return right_parent_code;
    }

    public void setRight_parent_code(String right_parent_code) {
        this.right_parent_code = right_parent_code == null ? null : right_parent_code.trim();
    }

    public String getRight_name() {
        return right_name;
    }

    public void setRight_name(String right_name) {
        this.right_name = right_name == null ? null : right_name.trim();
    }

    public String getRight_url() {
        return right_url;
    }

    public void setRight_url(String right_url) {
        this.right_url = right_url == null ? null : right_url.trim();
    }

    public String getRight_node_type() {
        return right_node_type;
    }

    public void setRight_node_type(String right_node_type) {
        this.right_node_type = right_node_type == null ? null : right_node_type.trim();
    }

    public String getRight_flag() {
        return right_flag;
    }

    public void setRight_flag(String right_flag) {
        this.right_flag = right_flag == null ? null : right_flag.trim();
    }
}