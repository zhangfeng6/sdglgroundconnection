package com.dyhc.sdglgroundconnection.service;

import com.dyhc.sdglgroundconnection.pojo.Reportfare;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游报账车费业务接口
 **/
public interface ReportfareService {
    /**
     *导游报账车费：贾晓亮
     * @param reportfare
     * @return
     */
    Integer saveReportfare(Reportfare reportfare);
}
