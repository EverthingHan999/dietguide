package com.je1809.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Article implements Serializable {
    private Integer aid;

    private Integer atid;

    private Integer uid;

    private String aname;

    private String aimg;

    private Date createTime;

    private Integer lookcount;

    private String remarks;

    private Users users;

    private List<ArticleDescr> articleDescrList;

    private static final long serialVersionUID = 1L;

    public List<ArticleDescr> getArticleDescrList() {
        return articleDescrList;
    }

    public void setArticleDescrList(List<ArticleDescr> articleDescrList) {
        this.articleDescrList = articleDescrList;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getAtid() {
        return atid;
    }

    public void setAtid(Integer atid) {
        this.atid = atid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname == null ? null : aname.trim();
    }

    public String getAimg() {
        return aimg;
    }

    public void setAimg(String aimg) {
        this.aimg = aimg == null ? null : aimg.trim();
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

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}