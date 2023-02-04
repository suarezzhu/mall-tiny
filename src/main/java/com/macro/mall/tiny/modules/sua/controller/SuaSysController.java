package com.macro.mall.tiny.modules.sua.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.modules.sua.dto.SuaSiteSearchParam;
import com.macro.mall.tiny.modules.sua.model.SuaSite;
import com.macro.mall.tiny.modules.sua.service.SuaSysService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sua/sys")
@Api(tags = "sysController")
@Tag(name = "sysController",description = "系统接口")
public class SuaSysController {

    @Autowired
    SuaSysService suaSysService;

    @ApiOperation("根据字典类型获取全部字典信息")
    @RequestMapping(value = "/getDictList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getDictList( @RequestParam(value = "type") String type) {
        List rsList=suaSysService.getDictList(type);
        return CommonResult.success(rsList,"success");
    }




}
