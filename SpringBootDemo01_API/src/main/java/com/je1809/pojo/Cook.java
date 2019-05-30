package com.je1809.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Cook implements Serializable {
    private Integer cid;

    private Integer uid;

    private String cimg;

    private String descr;

    private Date createTime;

    private Integer copycount;

    private Integer lookcount;

    private String remarks;

    private Integer cbtid;

    private String cname;

    private List<Users> cookuser;

    public List<Users> getCookuser() {
        return cookuser;
    }

    public void setCookuser(List<Users> cookuser) {
        this.cookuser = cookuser;
    }

    private static final long serialVersionUID = 1L;

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

    public String getCimg() {
        return cimg;
    }

    public void setCimg(String cimg) {
        this.cimg = cimg == null ? null : cimg.trim();
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCopycount() {
        return copycount;
    }

    public void setCopycount(Integer copycount) {
        this.copycount = copycount;
    }

    public Integer getLookcount() {
        return lookcount;
    }

    public void setLookcount(Integer lookcount) {
        this.lookcount = lookcount;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Integer getCbtid() {
        return cbtid;
    }

    public void setCbtid(Integer cbtid) {
        this.cbtid = cbtid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }
}