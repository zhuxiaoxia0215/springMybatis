package com.example.mapper;

import org.apache.ibatis.annotations.Select;

public interface OrderMapper {

    @Select("select 'orderName'")
    String getOrderName();
}
