package com.xr.entity;

import lombok.Data;

import java.util.Date;

@Data
public class RdEntityResponsibility {

  private int id;
  private String title;
  private String content;
  private Date createTime;
  private int createId;
  private String staus;
  private int state;
  private SysStaff sysStaff;
}
