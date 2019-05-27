package com.je1809.pojo;

import java.io.Serializable;

public class StuffDescr implements Serializable {
    private Integer sdid;

    private Integer cbtid;

    private String sdtype;

    private Integer count;

    private String descr;

    private String remarks;

    private static final long serialVersionUID = 1L;

    public Integer getSdid() {
        return sdid;
    }

    public void setSdid(Integer sdid) {
        this.sdid = sdid;
    }

    public Integer getCbtid() {
        return cbtid;
    }

    public void setCbtid(Integer cbtid) {
        this.cbtid = cbtid;
    }

    public String getSdtype() {
        return sdtype;
    }

    public void setSdtype(String sdtype) {
        this.sdtype = sdtype == null ? null : sdtype.trim();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}