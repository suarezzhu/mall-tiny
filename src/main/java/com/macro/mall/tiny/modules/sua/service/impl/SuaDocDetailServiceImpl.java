package com.macro.mall.tiny.modules.sua.service.impl;

import com.macro.mall.tiny.modules.sua.model.SuaDocDetail;
import com.macro.mall.tiny.modules.sua.mapper.SuaDocDetailMapper;
import com.macro.mall.tiny.modules.sua.model.SuaSite;
import com.macro.mall.tiny.modules.sua.service.SuaDocDetailService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author suarez
 * @since 2023-02-04
 */
@Service
public class SuaDocDetailServiceImpl extends ServiceImpl<SuaDocDetailMapper, SuaDocDetail> implements SuaDocDetailService {


    @Autowired
    SuaDocDetailMapper suaDocDetailMapper;

    @Override
    public void addDoc(SuaDocDetail suaDocDetail) {
        suaDocDetailMapper.addDoc(suaDocDetail);
    }


    /**
     * 获取文件夹树形结构
     *
     * @param suaDocDetail
     * @return
     */
    @Override
    public List getFolder() {
        try {
            List<Map> rs = suaDocDetailMapper.getFolderByParentId(-1);
            for (int i = 0; i < rs.size(); i++) {
                List<Map> rs1 = suaDocDetailMapper.getFolderByParentId((Integer) rs.get(i).get("id"));
                if (rs1.size() > 0) {
                    rs.get(i).put("children", rs1);
                    System.out.println(rs1.size());
                    for (int i1 = 0; i1 < rs1.size(); i1++) {
                        List<Map> rs2 = suaDocDetailMapper.getFolderByParentId((Integer) rs1.get(i1).get("id"));
                        if(rs2.size()>0){
                            rs1.get(i).put("children", rs2);
                        }
                    }
                }
            }
            return rs;
        } catch (Exception exception) {
            System.out.println(exception);
            throw exception;
        }

    }

    @Override
    public List getDocListByFolder(Integer id) {
        List rs = suaDocDetailMapper.getDocListByFolder(id);
        return rs;
    }

    @Override
    public Map getDocDetail(Integer id) {
        List<Map> rs = suaDocDetailMapper.getDocDetail(id);
        if(rs.size()>0){
            return  rs.get(0);
        }else {
            return null;
        }

    }

    @Override
    public void deleteDoc(Integer id) {
        suaDocDetailMapper.deleteDoc(id);

    }

    @Override
    public void deleteFolder(Integer id) {
        suaDocDetailMapper.deleteFolder(id);

    }

    @Override
    public void editDoc(SuaDocDetail suaDocDetail) {
        suaDocDetailMapper.editDoc(suaDocDetail);
    }
}
