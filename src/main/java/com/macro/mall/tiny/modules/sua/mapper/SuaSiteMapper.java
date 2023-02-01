package com.macro.mall.tiny.modules.sua.mapper;

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

    List<Map> getSiteList(@Param("param") SuaSiteSearchParam param);
    void addSite(@Param("param") SuaSiteAddParam param);
    void editSite(@Param("param") SuaSiteSearchParam param);
    void delSite(@Param("id") Integer id);
}