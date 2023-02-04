package com.macro.mall.tiny.modules.sua.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.macro.mall.tiny.modules.sua.dto.SuaSiteAddParam;
import com.macro.mall.tiny.modules.sua.dto.SuaSiteSearchParam;
import com.macro.mall.tiny.modules.sua.model.SuaSite;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SuaSysMapper extends BaseMapper {
    List<Map> getDictList(@Param("type") String type);
}
