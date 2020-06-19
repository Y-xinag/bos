package com.xr.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class SysStaff implements Serializable {
    private List<SysPost> posts;

    private Integer sid;

    private String name;

    private String sex;

    private Integer age;

    private String educationalBackground;

    private String politicalAppearance;

    private String phone;

    private Integer mid;

    private String username;

    private String password;

    private String salt;

    private String pid;

    @DateTimeFormat(pattern = "yyyy-MM-dd") // 前台传过来的日期格式转换
    @JsonFormat(pattern = "yyyy-MM-dd") // 后台的JAVA类型，转为JSON字符串
    private Date createTime;

    private Integer createId;

    private String staus;

    private static final long serialVersionUID = 1L;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEducationalBackground() {
        return educationalBackground;
    }

    public void setEducationalBackground(String educationalBackground) {
        this.educationalBackground = educationalBackground == null ? null : educationalBackground.trim();
    }

    public String getPoliticalAppearance() {
        return politicalAppearance;
    }

    public void setPoliticalAppearance(String politicalAppearance) {
        this.politicalAppearance = politicalAppearance == null ? null : politicalAppearance.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
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
