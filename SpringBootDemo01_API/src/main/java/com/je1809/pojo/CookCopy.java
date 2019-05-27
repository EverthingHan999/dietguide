package com.je1809.pojo;

import java.io.Serializable;
import java.util.Date;

public class CookCopy implements Serializable {
    private Integer ccid;

    private Integer cid;

    private Integer uid;

    private String ccimg;

    private String ccdescr;

    private Date createTime;

    private Integer lookCount;

    private String remarks;

    private static final long serialVersionUID = 1L;

    public Integer getCcid() {
        return ccid;
    }

    public void setCcid(Integer ccid) {
        this.ccid = ccid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getCcimg() {
        return ccimg;
    }

    public void setCcimg(String ccimg) {
        this.ccimg = ccimg == null ? null : ccimg.trim();
    }

    public String getCcdescr() {
        return ccdescr;
    }

    public void setCcdescr(String ccdescr) {
        this.ccdescr = ccdescr == null ? null : ccdescr.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getLookCount() {
        return lookCount;
    }

    public void setLookCount(Integer lookCount) {
        this.lookCount = lookCount;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}