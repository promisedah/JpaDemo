package cn.org.yunmo.hotel.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class OrdersLine {

    @Id
    @GeneratedValue
    private Integer oddId;

    private Integer oddOrderId;

    private Integer oddProdId;

    private Integer oddCount;

    private String oddUnit;

    public Integer getOddId() {
        return oddId;
    }

    public void setOddId(Integer oddId) {
        this.oddId = oddId;
    }

    public Integer getOddOrderId() {
        return oddOrderId;
    }

    public void setOddOrderId(Integer oddOrderId) {
        this.oddOrderId = oddOrderId;
    }

    public Integer getOddProdId() {
        return oddProdId;
    }

    public void setOddProdId(Integer oddProdId) {
        this.oddProdId = oddProdId;
    }

    public Integer getOddCount() {
        return oddCount;
    }

    public void setOddCount(Integer oddCount) {
        this.oddCount = oddCount;
    }

    public String getOddUnit() {
        return oddUnit;
    }

    public void setOddUnit(String oddUnit) {
        this.oddUnit = oddUnit == null ? null : oddUnit.trim();
    }
}