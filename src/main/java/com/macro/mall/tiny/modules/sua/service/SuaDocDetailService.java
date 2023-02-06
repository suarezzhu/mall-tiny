package com.macro.mall.tiny.modules.sua.service;

import com.macro.mall.tiny.modules.sua.model.SuaDocDetail;
import com.baomidou.mybatisplus.extension.service.IService;
import com.macro.mall.tiny.modules.sua.model.SuaSite;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author suarez
 * @since 2023-02-04
 */
public interface SuaDocDetailService extends IService<SuaDocDetail> {

    void addDoc(SuaDocDetail suaDocDetail);

    List getFolder();

    List getDocListByFolder(Integer id);

    Map getDocDetail(Integer id);

    void deleteDoc(Integer id);

    void deleteFolder(Integer id);

    void editDoc(SuaDocDetail suaDocDetail);
}
