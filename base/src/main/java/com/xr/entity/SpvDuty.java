package com.xr.entity;

import java.io.Serializable;
import java.util.Date;

public class SpvDuty implements Serializable {
    private Integer did;

    private String dutytype;

    private String dutytitle;

    private String dutycontent;

    private Integer bid;

    private String dutyaccessory;

    private Date newtime;

    private Integer eid;

    private Integer status;

    private static final long serialVersionUID = 1L;

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDutytype() {
        return dutytype;
    }

    public void setDutytype(String dutytype) {
        this.dutytype = dutytype == null ? null : dutytype.trim();
    }

    public String getDutytitle() {
        return dutytitle;
    }

    public void setDutytitle(String dutytitle) {
        this.dutytitle = dutytitle == null ? null : dutytitle.trim();
    }

    public String getDutycontent() {
        return dutycontent;
    }

    public void setDutycontent(String dutycontent) {
        this.dutycontent = dutycontent == null ? null : dutycontent.trim();
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getDutyaccessory() {
        return dutyaccessory;
    }

    public void setDutyaccessory(String dutyaccessory) {
        this.dutyaccessory = dutyaccessory == null ? null : dutyaccessory.trim();
    }

    public Date getNewtime() {
        return newtime;
    }

    public void setNewtime(Date newtime) {
        this.newtime = newtime;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}