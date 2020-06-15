package com.xr.entity;

import java.io.Serializable;
import java.util.Date;

public class Datacollection implements Serializable {
    private Integer did;

    private String dtitle;

    private String dfilename;

    private String dfile;

    private Date dcreatetime;

    private Integer dcreateid;

    private String dcreatename;

    private Integer dstatus;

    private static final long serialVersionUID = 1L;

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDtitle() {
        return dtitle;
    }

    public void setDtitle(String dtitle) {
        this.dtitle = dtitle == null ? null : dtitle.trim();
    }

    public String getDfilename() {
        return dfilename;
    }

    public void setDfilename(String dfilename) {
        this.dfilename = dfilename == null ? null : dfilename.trim();
    }

    public String getDfile() {
        return dfile;
    }

    public void setDfile(String dfile) {
        this.dfile = dfile == null ? null : dfile.trim();
    }

    public Date getDcreatetime() {
        return dcreatetime;
    }

    public void setDcreatetime(Date dcreatetime) {
        this.dcreatetime = dcreatetime;
    }

    public Integer getDcreateid() {
        return dcreateid;
    }

    public void setDcreateid(Integer dcreateid) {
        this.dcreateid = dcreateid;
    }

    public String getDcreatename() {
        return dcreatename;
    }

    public void setDcreatename(String dcreatename) {
        this.dcreatename = dcreatename == null ? null : dcreatename.trim();
    }

    public Integer getDstatus() {
        return dstatus;
    }

    public void setDstatus(Integer dstatus) {
        this.dstatus = dstatus;
    }
}