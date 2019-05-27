package com.je1809.pojo;

import java.io.Serializable;

public class CookbookThird implements Serializable {
    private Integer cbtid;

    private String cbtname;

    private String cbtimg;

    private String descr;

    private String remarks;

    private Integer cbsid;

    private static final long serialVersionUID = 1L;

    public Integer getCbtid() {
        return cbtid;
    }

    public void setCbtid(Integer cbtid) {
        this.cbtid = cbtid;
    }

    public String getCbtname() {
        return cbtname;
    }

    public void setCbtname(String cbtname) {
        this.cbtname = cbtname == null ? null : cbtname.trim();
    }

    public String getCbtimg() {
        return cbtimg;
    }

    public void setCbtimg(String cbtimg) {
        this.cbtimg = cbtimg == null ? null : cbtimg.trim();
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

    public Integer getCbsid() {
        return cbsid;
    }

    public void setCbsid(Integer cbsid) {
        this.cbsid = cbsid;
    }
}