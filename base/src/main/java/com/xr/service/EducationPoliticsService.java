package com.xr.service;

import com.xr.entity.EducationPolitics;

import java.util.List;

public interface EducationPoliticsService {

    List<EducationPolitics> list();
    List<EducationPolitics> list1(String name, Integer page, Integer limit);

    //添加
    void EducationPoliticsAdd(EducationPolitics educationPolitics);

    //修改
    void EducationPoliticsUpdate(EducationPolitics educationPolitics);

    //删除
    void EducationPoliticsDelete(int id);
}
