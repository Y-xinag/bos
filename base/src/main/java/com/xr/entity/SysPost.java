package com.xr.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class SysPost implements Serializable {
    private List<SysPermission> permissions;

    private Integer pid;

    private String pname;

    private Integer mid;

    private String message;

    @DateTimeFormat(pattern = "yyyy-MM-dd") // 前台传过来的日期格式转换
    @JsonFormat(pattern = "yyyy-MM-dd") // 后台的JAVA类型，转为JSON字符串
    private Date createTime;

    private Integer createId;

    private String staus;

    private static final long serialVersionUID = 1L;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateId() {
        return createId;
    }

    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    public String getStaus() {
        return staus;
    }

    public void setStaus(String staus) {
        this.staus = staus == null ? null : staus.trim();
    }
}
