package com.xr.util;

public class CommonUtil {
    private CommonUtil(){}

    private static boolean isNotNull(Object obj){
        if (obj ==null ){
            return false;
        }
        if(obj instanceof String){
            if(((String) obj).trim().equals("")){
                return false;
            }
        }
        return true;
    }
}
