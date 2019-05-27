package com.je1809.pojo;

import java.io.Serializable;

public class ArticleType implements Serializable {
    private Integer atid;

    private String atname;

    private String remarks;

    private static final long serialVersionUID = 1L;

    public Integer getAtid() {
        return atid;
    }

    public void setAtid(Integer atid) {
        this.atid = atid;
    }

    public String getAtname() {
        return atname;
    }

    public void setAtname(String atname) {
        this.atname = atname == null ? null : atname.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}