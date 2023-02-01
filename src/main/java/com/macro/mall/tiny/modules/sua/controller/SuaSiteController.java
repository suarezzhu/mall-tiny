package com.macro.mall.tiny.modules.sua.controller;


import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.modules.sua.dto.SuaSiteAddParam;
import com.macro.mall.tiny.modules.sua.dto.SuaSiteSearchParam;
import com.macro.mall.tiny.modules.sua.service.SuaSiteService;
import com.macro.mall.tiny.modules.ums.dto.UpdateAdminPasswordParam;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 网站信息表 前端控制器
 * </p>
 *
 * @author suarez
 * @since 2023-01-31
 */
@RestController
@RequestMapping("/sua/suaSite")
@Api(tags = "SuaSiteController")
@Tag(name = "SuaSiteController",description = "网站数据库获取")
public class SuaSiteController {
    @Autowired
    SuaSiteService suaSiteService;

    @ApiOperation("获取网站全部数据")
    @RequestMapping(value = "/getSiteList", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult getSiteList(@Validated @RequestBody SuaSiteSearchParam suaSiteSearchParam) {
        List rs=suaSiteService.getSiteList(suaSiteSearchParam);
        return  CommonResult.success(rs,"返回成功");
    }


    @ApiOperation("添加网站")
    @RequestMapping(value = "/addSite", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult addSite(@Validated @RequestBody SuaSiteAddParam suaSiteAddParam) {
        Boolean rs=suaSiteService.addSite(suaSiteAddParam);
        CommonResult commonResult=new CommonResult();
        if(rs==true){
            commonResult.success(rs,"返回成功");
        }else {
            commonResult.failed("添加失败");
        }
        return  commonResult;
    }

//    @ApiOperation("修改网站")
//    @RequestMapping(value = "/editSite", method = RequestMethod.PUT)
//    @ResponseBody
//    public CommonResult addSite(@Validated @RequestBody SuaSiteSearchParam suaSiteSearchParam) {
//        List rs=suaSiteService.addSite(suaSiteSearchParam);
//        return  CommonResult.success(rs,"返回成功");
//    }
//


//    @ApiOperation("删除网站")
//    @RequestMapping(value = "/delSite", method = RequestMethod.DELETE)
//    @ResponseBody
//    public CommonResult addSite(@RequestBody SuaSiteSearchParam suaSiteSearchParam) {
//        List rs=suaSiteService.addSite(suaSiteSearchParam);
//        return  CommonResult.success(rs,"返回成功");
//    }











}

