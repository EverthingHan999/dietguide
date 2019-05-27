package com.je1809.pojo;

import java.io.Serializable;
import java.util.Date;

public class CookCommentAnswer implements Serializable {
    private Integer ckcaid;

    private Integer ckcid;

    private Integer uid;

    private Date createTime;

    private String descr;

    private String remarks;

    private Integer answeruid;

    private static final long serialVersionUID = 1L;

    public Integer getCkcaid() {
        return ckcaid;
    }

    public void setCkcaid(Integer ckcaid) {
        this.ckcaid = ckcaid;
    }

    public Integer getCkcid() {
        return ckcid;
    }

    public void setCkcid(Integer ckcid) {
        this.ckcid = ckcid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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

    public Integer getAnsweruid() {
        return answeruid;
    }

    public void setAnsweruid(Integer answeruid) {
        this.answeruid = answeruid;
    }
}