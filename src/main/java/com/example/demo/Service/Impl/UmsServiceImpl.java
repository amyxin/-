package com.example.demo.Service.Impl;

import com.example.demo.Service.UmsService;
import com.example.demo.mapper.UmsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UmsServiceImpl implements UmsService {

    @Autowired
    private UmsMapper umsMapper;

    @Override
    public String selectIds() {
        return umsMapper.selectByPrimaryKey((long) 1).getId().toString();
    }
}
