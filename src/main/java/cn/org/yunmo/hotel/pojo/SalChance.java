package cn.org.yunmo.hotel.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class SalChance {

    @Id
    @GeneratedValue
    private Integer chcId;

    private String chcSource;

    private String chcCustName;

    private String chcTitle;

    private Double chcRate;

    private String chcLinkman;

    private String chcTel;

    private String chcMobile;

    private Integer chcCreateId;

    private Date chcCreateDate;

    private Integer chcDueId;

    private Date chcDueDate;

    private String chcDesc;

    private String chcStatus;

    private String chcFlag;

    public Integer getChcId() {
        return chcId;
    }

    public void setChcId(Integer chcId) {
        this.chcId = chcId;
    }

    public String getChcSource() {
        return chcSource;
    }

    public void setChcSource(String chcSource) {
        this.chcSource = chcSource == null ? null : chcSource.trim();
    }

    public String getChcCustName() {
        return chcCustName;
    }

    public void setChcCustName(String chcCustName) {
        this.chcCustName = chcCustName == null ? null : chcCustName.trim();
    }

    public String getChcTitle() {
        return chcTitle;
    }

    public void setChcTitle(String chcTitle) {
        this.chcTitle = chcTitle == null ? null : chcTitle.trim();
    }

    public Double getChcRate() {
        return chcRate;
    }

    public void setChcRate(Double chcRate) {
        this.chcRate = chcRate;
    }

    public String getChcLinkman() {
        return chcLinkman;
    }

    public void setChcLinkman(String chcLinkman) {
        this.chcLinkman = chcLinkman == null ? null : chcLinkman.trim();
    }

    public String getChcTel() {
        return chcTel;
    }

    public void setChcTel(String chcTel) {
        this.chcTel = chcTel == null ? null : chcTel.trim();
    }

    public String getChcMobile() {
        return chcMobile;
    }

    public void setChcMobile(String chcMobile) {
        this.chcMobile = chcMobile == null ? null : chcMobile.trim();
    }

    public Integer getChcCreateId() {
        return chcCreateId;
    }

    public void setChcCreateId(Integer chcCreateId) {
        this.chcCreateId = chcCreateId;
    }

    public Date getChcCreateDate() {
        return chcCreateDate;
    }

    public void setChcCreateDate(Date chcCreateDate) {
        this.chcCreateDate = chcCreateDate;
    }

    public Integer getChcDueId() {
        return chcDueId;
    }

    public void setChcDueId(Integer chcDueId) {
        this.chcDueId = chcDueId;
    }

    public Date getChcDueDate() {
        return chcDueDate;
    }

    public void setChcDueDate(Date chcDueDate) {
        this.chcDueDate = chcDueDate;
    }

    public String getChcDesc() {
        return chcDesc;
    }

    public void setChcDesc(String chcDesc) {
        this.chcDesc = chcDesc == null ? null : chcDesc.trim();
    }

    public String getChcStatus() {
        return chcStatus;
    }

    public void setChcStatus(String chcStatus) {
        this.chcStatus = chcStatus == null ? null : chcStatus.trim();
    }

    public String getChcFlag() {
        return chcFlag;
    }

    public void setChcFlag(String chcFlag) {
        this.chcFlag = chcFlag == null ? null : chcFlag.trim();
    }
}