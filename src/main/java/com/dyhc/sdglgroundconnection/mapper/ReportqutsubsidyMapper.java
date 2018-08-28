package com.dyhc.sdglgroundconnection.mapper;

import com.dyhc.sdglgroundconnection.pojo.Reportqutsubsidy;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游报账出团补助
 **/
@Mapper
@Component
public interface ReportqutsubsidyMapper extends CommonMapper<Reportqutsubsidy>{

    /**
     * 获取导游出团补助信息
     * @param reportDetailId
     * @return
     */
    Reportqutsubsidy getReportqutsubsidyById(@Param("reportDetailId") Integer reportDetailId)throws Exception;
}
