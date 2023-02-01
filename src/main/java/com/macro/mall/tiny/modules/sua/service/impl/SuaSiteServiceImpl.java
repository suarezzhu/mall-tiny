package com.macro.mall.tiny.modules.sua.service.impl;

import com.macro.mall.tiny.modules.sua.dto.SuaSiteAddParam;
import com.macro.mall.tiny.modules.sua.dto.SuaSiteSearchParam;
import com.macro.mall.tiny.modules.sua.model.SuaSite;
import com.macro.mall.tiny.modules.sua.mapper.SuaSiteMapper;
import com.macro.mall.tiny.modules.sua.service.SuaSiteService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 网站信息表 服务实现类
 * </p>
 *
 * @author suarez
 * @since 2023-01-31
 */
@Service
public class SuaSiteServiceImpl extends ServiceImpl<SuaSiteMapper, SuaSite> implements SuaSiteService {

    @Autowired
    private SuaSiteMapper suaSiteMapper;

    @Override
    public List getSiteList(SuaSiteSearchParam suaSiteSearchParam) {
        List<Map> rs = suaSiteMapper.getSiteList(suaSiteSearchParam);
        return rs;
    }

    @Override
    public Boolean addSite(SuaSiteAddParam suaSiteAddParam) {
        Boolean rs;
        try {
            suaSiteMapper.addSite(suaSiteAddParam);
            rs = true;
        } catch (Exception exception) {
            rs = false;
        }
        return rs;

    }

    @Override
    public void editSite(Integer id) {

    }

    @Override
    public void delSite(Integer id) {

    }

    @Override
    public void getSiteDetailById(Integer id) {

    }
}
