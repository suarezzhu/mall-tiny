package com.macro.mall.tiny.modules.sua.mapper;

import com.macro.mall.tiny.modules.sua.model.SuaDocDetail;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.lettuce.core.dynamic.annotation.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author suarez
 * @since 2023-02-04
 */
public interface SuaDocDetailMapper extends BaseMapper<SuaDocDetail> {

     List getDocListByFolder(Integer id) ;
     List getFolderByParentId(Integer pid) ;

    void addDoc(@Param("param")SuaDocDetail param);
    void editDoc(@Param("param")SuaDocDetail param);

    List getDocDetail(Integer id);

    void deleteDoc(Integer id);

    void deleteFolder(Integer id);
}
