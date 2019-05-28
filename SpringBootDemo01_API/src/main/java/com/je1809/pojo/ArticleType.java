package com.je1809.pojo;

import java.io.Serializable;
import java.util.List;

public class ArticleType implements Serializable {
    private Integer atid;

    private String atname;

    private String remarks;

    private List<Article> articleList;

    private static final long serialVersionUID = 1L;

    public List<Article> getArticleList() {
        return articleList;
    }

    public void setArticleList(List<Article> articleList) {
        this.articleList = articleList;
    }

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