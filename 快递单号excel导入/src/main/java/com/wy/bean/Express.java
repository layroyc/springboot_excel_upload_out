package com.wy.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * express
 * @author 
 */
public class Express implements Serializable {
    /**
     * 序号
     */
    private Integer id;

    /**
     * 保单号
     */
    private String policyNo;

    /**
     * 快递公司
     */
    private String csCompany;

    /**
     * 快递单号
     */
    private String courierNumber;

    /**
     * 备注
     */
    private String remark;

    /**
     * 邮寄时间
     */
    private Date mailingDate;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }

    public String getCsCompany() {
        return csCompany;
    }

    public void setCsCompany(String csCompany) {
        this.csCompany = csCompany;
    }

    public String getCourierNumber() {
        return courierNumber;
    }

    public void setCourierNumber(String courierNumber) {
        this.courierNumber = courierNumber;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getMailingDate() {
        return mailingDate;
    }

    public void setMailingDate(Date mailingDate) {
        this.mailingDate = mailingDate;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Express other = (Express) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPolicyNo() == null ? other.getPolicyNo() == null : this.getPolicyNo().equals(other.getPolicyNo()))
            && (this.getCsCompany() == null ? other.getCsCompany() == null : this.getCsCompany().equals(other.getCsCompany()))
            && (this.getCourierNumber() == null ? other.getCourierNumber() == null : this.getCourierNumber().equals(other.getCourierNumber()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getMailingDate() == null ? other.getMailingDate() == null : this.getMailingDate().equals(other.getMailingDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPolicyNo() == null) ? 0 : getPolicyNo().hashCode());
        result = prime * result + ((getCsCompany() == null) ? 0 : getCsCompany().hashCode());
        result = prime * result + ((getCourierNumber() == null) ? 0 : getCourierNumber().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getMailingDate() == null) ? 0 : getMailingDate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", policyNo=").append(policyNo);
        sb.append(", csCompany=").append(csCompany);
        sb.append(", courierNumber=").append(courierNumber);
        sb.append(", remark=").append(remark);
        sb.append(", mailingDate=").append(mailingDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}