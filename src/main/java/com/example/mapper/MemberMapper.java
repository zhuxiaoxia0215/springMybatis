package com.example.mapper;

import org.apache.ibatis.annotations.Select;

public interface MemberMapper {
    @Select("select 'memberMapper'")
    String getMemberMapper();

}
