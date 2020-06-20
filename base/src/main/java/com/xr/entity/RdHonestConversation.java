package com.xr.entity;


import lombok.Data;

import java.util.Date;

@Data
public class RdHonestConversation {

  private int id;
  private int pid;
  private int mid;
  private String politicaloutlook;
  private String post;
  private String talktype;
  private Date talktime;
  private String talkplace;
  private int createId;
  private String talktitle;
  private String talkcontent;
  private java.sql.Time createTime;
  private String createName;
  private String staus;
  private int state;
}
