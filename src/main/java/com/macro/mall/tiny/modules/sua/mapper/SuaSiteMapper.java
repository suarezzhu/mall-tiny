package com.macro.mall.tiny.modules.sua.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.macro.mall.tiny.modules.sua.dto.SuaSiteAddParam;
import com.macro.mall.tiny.modules.sua.dto.SuaSiteSearchParam;
import com.macro.mall.tiny.modules.sua.model.SuaSite;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 网站信息表 Mapper 接口
 * </p>
 *
 * @author suarez
 * @since 2023-01-31
 */
public interface SuaSiteMapper extends BaseMapper<SuaSite> {

    IPage<SuaSite> getSiteList(Page<SuaSite> page, @Param("param") SuaSiteSearchParam param);
    void addSite(@Param("param") SuaSiteAddParam param);
    void editSite(@Param("param") SuaSite param);
    void delSite(@Param("id") Integer id);

    List getSiteDetail(@Param("id") Integer id);
}
