package com.dyhc.sdglgroundconnection.mapper;

import com.dyhc.sdglgroundconnection.pojo.Template;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 模板
 **/
@Mapper
@Component
public interface TemplateMapper  extends CommonMapper<Template>{

    /**
     * 根据模板名称和创建人查询符合条件的模板信息    张枫
     * @param tempName  模板名称
     * @param username  创建人
     * @return
     * @throws Exception
     */
    List<Template> listtemplate(@Param("tempName")String tempName,@Param("username")String username)throws Exception;
}
