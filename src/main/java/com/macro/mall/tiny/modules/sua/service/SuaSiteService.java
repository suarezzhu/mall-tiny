package com.macro.mall.tiny.modules.sua.service;

import com.macro.mall.tiny.modules.sua.dto.SuaSiteAddParam;
import com.macro.mall.tiny.modules.sua.dto.SuaSiteSearchParam;
import com.macro.mall.tiny.modules.sua.model.SuaSite;
import com.baomidou.mybatisplus.extension.service.IService;
import io.swagger.models.auth.In;

import java.util.List;

/**
 * <p>
 * 网站信息表 服务类
 * </p>
 *
 * @author suarez
 * @since 2023-01-31
 */
public interface SuaSiteService extends IService<SuaSite> {


    List getSiteList(SuaSiteSearchParam suaSiteSearchParam);
    Boolean addSite(SuaSiteAddParam suaSiteAddParam);
    void editSite(Integer id);
    void delSite(Integer id);
    void getSiteDetailById(Integer id);



}
