package com.je1809.pojo;

import java.io.Serializable;

public class CookSeasoning implements Serializable {
    private Integer ckseid;

    private String cksename;

    private String cksamount;

    private String remarks;

    private Integer cid;

    private static final long serialVersionUID = 1L;

    public Integer getCkseid() {
        return ckseid;
    }

    public void setCkseid(Integer ckseid) {
        this.ckseid = ckseid;
    }

    public String getCksename() {
        return cksename;
    }

    public void setCksename(String cksename) {
        this.cksename = cksename == null ? null : cksename.trim();
    }

    public String getCksamount() {
        return cksamount;
    }

    public void setCksamount(String cksamount) {
        this.cksamount = cksamount == null ? null : cksamount.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }
}