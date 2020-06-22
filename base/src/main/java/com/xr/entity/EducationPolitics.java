package com.xr.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Data
public class EducationPolitics implements Serializable {
    private Integer id;

    private String title;

    private String source;

    private String type;

    @DateTimeFormat(pattern = "yyyy-MM-dd") // 前台传过来的日期格式转换
    @JsonFormat(pattern = "yyyy-MM-dd") // 后台的JAVA类型，转为JSON字符串
    private Date time;

    @DateTimeFormat(pattern = "yyyy-MM-dd") // 前台传过来的日期格式转换
    @JsonFormat(pattern = "yyyy-MM-dd") // 后台的JAVA类型，转为JSON字符串
    private Date createTime;

    private Integer createId;

    private String staus;

    private String content;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}
