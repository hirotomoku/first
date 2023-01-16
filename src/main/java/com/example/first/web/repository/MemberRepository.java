package com.example.first.web.repository;

import com.example.first.web.entity.MemberEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MemberRepository {
    @Select("select * from member")
    List<MemberEntity> findAll();
}
