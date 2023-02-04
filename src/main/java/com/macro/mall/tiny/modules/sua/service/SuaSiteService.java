package com.macro.mall.tiny.modules.sua.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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


    IPage<SuaSite> getSiteList(Page<SuaSite> page, SuaSiteSearchParam suaSiteSearchParam);
    Boolean addSite(SuaSiteAddParam suaSiteAddParam);
    void editSite(SuaSite suaSite);
    void delSite(Integer id);


    List getSiteDetail(Integer id);
}
