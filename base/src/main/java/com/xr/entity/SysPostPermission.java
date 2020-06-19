package com.xr.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class SysPostPermission implements Serializable {
    private Integer id;

    private Integer postid;

    private Integer pid;

    private String stuas;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getStuas() {
        return stuas;
    }

    public void setStuas(String stuas) {
        this.stuas = stuas == null ? null : stuas.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
