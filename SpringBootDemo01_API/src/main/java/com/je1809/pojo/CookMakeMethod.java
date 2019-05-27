package com.je1809.pojo;

import java.io.Serializable;

public class CookMakeMethod implements Serializable {
    private Integer cmmid;

    private Integer cid;

    private Integer whichstep;

    private String cookimg;

    private String descr;

    private String remarks;

    private static final long serialVersionUID = 1L;

    public Integer getCmmid() {
        return cmmid;
    }

    public void setCmmid(Integer cmmid) {
        this.cmmid = cmmid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getWhichstep() {
        return whichstep;
    }

    public void setWhichstep(Integer whichstep) {
        this.whichstep = whichstep;
    }

    public String getCookimg() {
        return cookimg;
    }

    public void setCookimg(String cookimg) {
        this.cookimg = cookimg == null ? null : cookimg.trim();
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