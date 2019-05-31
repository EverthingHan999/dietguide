package com.je1809.pojo;

import java.io.Serializable;

public class MyAttention implements Serializable {
    private Integer maid;

    private Integer myuid;

    private Integer uid;

    private String remarks;

    private Users users;

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    private static final long serialVersionUID = 1L;

    public Integer getMaid() {
        return maid;
    }

    public void setMaid(Integer maid) {
        this.maid = maid;
    }

    public Integer getMyuid() {
        return myuid;
    }

    public void setMyuid(Integer myuid) {
        this.myuid = myuid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}