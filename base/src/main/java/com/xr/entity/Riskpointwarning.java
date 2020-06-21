package com.xr.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
public class Riskpointwarning implements Serializable {
    private Integer wid;

    private Integer warningid;

    private String wtitle;

    private String wcontent;

    private Date wcreatetime;

    private Integer wloginid;

    private String wcreatename;

    private Integer wstatus;

    private String staus;
}