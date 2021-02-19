package com.example.demo.mapper;

import com.example.demo.dto.UmsMember;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

@Repository
public interface UmsMapper {
    UmsMember selectByPrimaryKey(Long id);
}
