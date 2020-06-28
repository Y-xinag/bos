package com.xr.service.impl;

import com.xr.entity.EducationPolitics;
import com.xr.entity.SysMechanism;
import com.xr.mapper.EducationPoliticsMapper;
import com.xr.service.EducationPoliticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationPoliticsServiceImpl implements EducationPoliticsService {
    @Autowired
    private EducationPoliticsMapper educationPoliticsMapper;

    @Override
    public List<EducationPolitics> list() {
        return educationPoliticsMapper.list();
    }

    @Override
    public List<EducationPolitics> list1(String name, Integer page, Integer limit) {
        return educationPoliticsMapper.list1(name, page, limit);
    }

    @Override
    public void EducationPoliticsAdd(EducationPolitics educationPolitics) {
        educationPoliticsMapper.insertSelective(educationPolitics);
    }

    @Override
    public void EducationPoliticsUpdate(EducationPolitics educationPolitics) {
        //educationPoliticsMapper.updateByPrimaryKey(educationPolitics);
        educationPoliticsMapper.updateByPrimaryKeySelective(educationPolitics);
    }

    @Override
    public void EducationPoliticsDelete(int id) {
        educationPoliticsMapper.deleteByPrimaryKey(id);
    }
}
