package cn.org.yunmo.hotel.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class CstService {

    @Id
    @GeneratedValue
    private Integer svrId;

    private String svrType;

    private String svrTitle;

    private String svrCustNo;

    private String svrStatus;

    private String svrRequest;

    private Integer svrCreateId;

    private Date svrCreateDate;

    private Integer svrDueId;

    private Date svrDueDate;

    private String svrDeal;

    private Date svrDealDate;

    private String svrResult;

    private Integer svrSatisfy;

    private String svrFlag;

    public Integer getSvrId() {
        return svrId;
    }

    public void setSvrId(Integer svrId) {
        this.svrId = svrId;
    }

    public String getSvrType() {
        return svrType;
    }

    public void setSvrType(String svrType) {
        this.svrType = svrType == null ? null : svrType.trim();
    }

    public String getSvrTitle() {
        return svrTitle;
    }

    public void setSvrTitle(String svrTitle) {
        this.svrTitle = svrTitle == null ? null : svrTitle.trim();
    }

    public String getSvrCustNo() {
        return svrCustNo;
    }

    public void setSvrCustNo(String svrCustNo) {
        this.svrCustNo = svrCustNo == null ? null : svrCustNo.trim();
    }

    public String getSvrStatus() {
        return svrStatus;
    }

    public void setSvrStatus(String svrStatus) {
        this.svrStatus = svrStatus == null ? null : svrStatus.trim();
    }

    public String getSvrRequest() {
        return svrRequest;
    }

    public void setSvrRequest(String svrRequest) {
        this.svrRequest = svrRequest == null ? null : svrRequest.trim();
    }

    public Integer getSvrCreateId() {
        return svrCreateId;
    }

    public void setSvrCreateId(Integer svrCreateId) {
        this.svrCreateId = svrCreateId;
    }

    public Date getSvrCreateDate() {
        return svrCreateDate;
    }

    public void setSvrCreateDate(Date svrCreateDate) {
        this.svrCreateDate = svrCreateDate;
    }

    public Integer getSvrDueId() {
        return svrDueId;
    }

    public void setSvrDueId(Integer svrDueId) {
        this.svrDueId = svrDueId;
    }

    public Date getSvrDueDate() {
        return svrDueDate;
    }

    public void setSvrDueDate(Date svrDueDate) {
        this.svrDueDate = svrDueDate;
    }

    public String getSvrDeal() {
        return svrDeal;
    }

    public void setSvrDeal(String svrDeal) {
        this.svrDeal = svrDeal == null ? null : svrDeal.trim();
    }

    public Date getSvrDealDate() {
        return svrDealDate;
    }

    public void setSvrDealDate(Date svrDealDate) {
        this.svrDealDate = svrDealDate;
    }

    public String getSvrResult() {
        return svrResult;
    }

    public void setSvrResult(String svrResult) {
        this.svrResult = svrResult == null ? null : svrResult.trim();
    }

    public Integer getSvrSatisfy() {
        return svrSatisfy;
    }

    public void setSvrSatisfy(Integer svrSatisfy) {
        this.svrSatisfy = svrSatisfy;
    }

    public String getSvrFlag() {
        return svrFlag;
    }

    public void setSvrFlag(String svrFlag) {
        this.svrFlag = svrFlag == null ? null : svrFlag.trim();
    }
}