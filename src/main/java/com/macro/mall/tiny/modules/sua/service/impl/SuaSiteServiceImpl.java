package com.macro.mall.tiny.modules.sua.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.macro.mall.tiny.modules.sua.dto.SuaSiteAddParam;
import com.macro.mall.tiny.modules.sua.dto.SuaSiteSearchParam;
import com.macro.mall.tiny.modules.sua.model.SuaSite;
import com.macro.mall.tiny.modules.sua.mapper.SuaSiteMapper;
import com.macro.mall.tiny.modules.sua.service.SuaSiteService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.macro.mall.tiny.modules.ums.model.UmsMenu;
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
    public IPage<SuaSite> getSiteList(Page<SuaSite>page, SuaSiteSearchParam suaSiteSearchParam) {
        IPage rs = suaSiteMapper.getSiteList(page,suaSiteSearchParam);
        return rs;
    }

//    Page<UmsMenu> page = new Page<>(pageNum,pageSize);
//    QueryWrapper<UmsMenu> wrapper = new QueryWrapper<>();
//        wrapper.lambda().eq(UmsMenu::getParentId,parentId)
//                .orderByDesc(UmsMenu::getSort);
//        return page(page,wrapper);

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
    public void editSite(SuaSite suaSite) {
        suaSiteMapper.editSite(suaSite);

    }

    @Override
    public void delSite(Integer id) {
        suaSiteMapper.delSite(id);

    }


    @Override
    public List getSiteDetail(Integer id) {
       List rs= suaSiteMapper.getSiteDetail(id);
        return rs;
    }
}
