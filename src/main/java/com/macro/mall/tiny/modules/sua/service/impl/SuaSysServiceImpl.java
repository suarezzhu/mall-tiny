package com.macro.mall.tiny.modules.sua.service.impl;




import com.macro.mall.tiny.modules.sua.mapper.SuaSysMapper;
import com.macro.mall.tiny.modules.sua.service.SuaSysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class SuaSysServiceImpl implements SuaSysService {
    @Autowired
    SuaSysMapper suaSysMapper;

    @Override
    public List getDictList(String type) {
        List rsList=suaSysMapper.getDictList(type);
        return rsList;
    }


}
