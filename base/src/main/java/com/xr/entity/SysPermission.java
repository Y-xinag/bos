package com.xr.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class SysPermission implements Serializable {
    private Integer id;

    private String menuCode;

    private String menuName;

    private String permissionCode;

    private String permissionName;

    private Integer requiredPermission;

    private static final long serialVersionUID = 1L;
}
