package com.dyhc.sdglgroundconnection.mapper;

import com.dyhc.sdglgroundconnection.pojo.Discar;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 调度用车
 **/
@Mapper
@Component
public interface DiscarMapper extends CommonMapper<Discar>{
    /*
    查询调度用车表
     */
    Discar discar(@Param("disCarId") Integer disCarId);
}
