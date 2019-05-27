package com.je1809.pojo;

import java.io.Serializable;
import java.util.Date;

public class Menu implements Serializable {
    private Integer mid;

    private Integer mtid;

    private Date createTime;

    private Integer lookcount;

    private String mname;

    private String mimg;

    private String mdescr;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getMtid() {
        return mtid;
    }

    public void setMtid(Integer mtid) {
        this.mtid = mtid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getLookcount() {
        return lookcount;
    }

    public void setLookcount(Integer lookcount) {
        this.lookcount = lookcount;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname == null ? null : mname.trim();
    }

    public String getMimg() {
        return mimg;
    }

    public void setMimg(String mimg) {
        this.mimg = mimg == null ? null : mimg.trim();
    }

    public String getMdescr() {
        return mdescr;
    }

    public void setMdescr(String mdescr) {
        this.mdescr = mdescr == null ? null : mdescr.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}