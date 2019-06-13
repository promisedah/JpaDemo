package cn.org.yunmo.hotel.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue
    private Integer prod_id;

    private String prod_name;

    private String prod_type;

    private String prod_batch;

    private String prod_unit;

    private Double prod_price;

    private String prod_memo;

    public Integer getProd_id() {
        return prod_id;
    }

    public void setProd_id(Integer prod_id) {
        this.prod_id = prod_id;
    }

    public String getProd_name() {
        return prod_name;
    }

    public void setProd_name(String prod_name) {
        this.prod_name = prod_name == null ? null : prod_name.trim();
    }

    public String getProd_type() {
        return prod_type;
    }

    public void setProd_type(String prod_type) {
        this.prod_type = prod_type == null ? null : prod_type.trim();
    }

    public String getProd_batch() {
        return prod_batch;
    }

    public void setProd_batch(String prod_batch) {
        this.prod_batch = prod_batch == null ? null : prod_batch.trim();
    }

    public String getProd_unit() {
        return prod_unit;
    }

    public void setProd_unit(String prod_unit) {
        this.prod_unit = prod_unit == null ? null : prod_unit.trim();
    }

    public Double getProd_price() {
        return prod_price;
    }

    public void setProd_price(Double prod_price) {
        this.prod_price = prod_price;
    }

    public String getProd_memo() {
        return prod_memo;
    }

    public void setProd_memo(String prod_memo) {
        this.prod_memo = prod_memo == null ? null : prod_memo.trim();
    }
}