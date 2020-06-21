package com.xr.entity;


import lombok.Data;

import java.util.Date;


@Data
public class RdWorkPlan {

  private int id;
  private String title;
  private String content;
  private Date createTime;
  private int createId;
  private String staus;
  private String state;
  private SysStaff sysStaff;


}
