package com.je1809.pojo;

import java.io.Serializable;
import java.util.List;

public class Cookbook implements Serializable {
    private Integer cbid;

    private String cbname;

    private String descr;

    private String remarks;

    private List<CookbootSecond> cookbootSeconds;

    private static final long serialVersionUID = 1L;

    public List<CookbootSecond> getCookbootSeconds() {
        return cookbootSeconds;
    }

    public void setCookbootSeconds(List<CookbootSecond> cookbootSeconds) {
        this.cookbootSeconds = cookbootSeconds;
    }

    public Integer getCbid() {
        return cbid;
    }

    public void setCbid(Integer cbid) {
        this.cbid = cbid;
    }

    public String getCbname() {
        return cbname;
    }

    public void setCbname(String cbname) {
        this.cbname = cbname == null ? null : cbname.trim();
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