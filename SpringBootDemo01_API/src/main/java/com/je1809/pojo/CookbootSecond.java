package com.je1809.pojo;

import java.io.Serializable;
import java.util.List;

public class CookbootSecond implements Serializable {
    private Integer cbsid;

    private String cbname;

    private String cbimg;

    private String descr;

    private String remarks;

    private Integer cbid;

    private List<CookbookThird> cookSencondThird;

    public List<CookbookThird> getCookSencondThird() {
        return cookSencondThird;
    }

    public void setCookSencondThird(List<CookbookThird> cookSencondThird) {
        this.cookSencondThird = cookSencondThird;
    }
    private static final long serialVersionUID = 1L;

    public Integer getCbsid() {
        return cbsid;
    }

    public void setCbsid(Integer cbsid) {
        this.cbsid = cbsid;
    }

    public String getCbname() {
        return cbname;
    }

    public void setCbname(String cbname) {
        this.cbname = cbname == null ? null : cbname.trim();
    }

    public String getCbimg() {
        return cbimg;
    }

    public void setCbimg(String cbimg) {
        this.cbimg = cbimg == null ? null : cbimg.trim();
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

    public Integer getCbid() {
        return cbid;
    }

    public void setCbid(Integer cbid) {
        this.cbid = cbid;
    }
}