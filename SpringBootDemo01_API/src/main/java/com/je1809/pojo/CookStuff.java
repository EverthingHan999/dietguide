package com.je1809.pojo;

import java.io.Serializable;

public class CookStuff implements Serializable {
    private Integer cstid;

    private String cstname;

    private String cstamount;

    private String remarks;

    private Integer cid;

    private static final long serialVersionUID = 1L;

    public Integer getCstid() {
        return cstid;
    }

    public void setCstid(Integer cstid) {
        this.cstid = cstid;
    }

    public String getCstname() {
        return cstname;
    }

    public void setCstname(String cstname) {
        this.cstname = cstname == null ? null : cstname.trim();
    }

    public String getCstamount() {
        return cstamount;
    }

    public void setCstamount(String cstamount) {
        this.cstamount = cstamount == null ? null : cstamount.trim();
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