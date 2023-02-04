package com.macro.mall.tiny.modules.sua.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.modules.sua.dto.SuaSiteAddParam;
import com.macro.mall.tiny.modules.sua.dto.SuaSiteSearchParam;
import com.macro.mall.tiny.modules.sua.model.SuaSite;
import com.macro.mall.tiny.modules.sua.service.SuaSiteService;
import com.macro.mall.tiny.modules.ums.dto.UpdateAdminPasswordParam;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
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
@Tag(name = "SuaSiteController", description = "网站数据库获取")
public class SuaSiteController {
    @Autowired
    SuaSiteService suaSiteService;


    //    @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
//    @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum)
    @ApiOperation("获取网站全部数据")
    @RequestMapping(value = "/getSiteList", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult getSiteList(@Validated @RequestBody SuaSiteSearchParam suaSiteSearchParam) {
        Integer pageSize = suaSiteSearchParam.getPageSize();
        Integer pageNum = suaSiteSearchParam.getPageNum();
        IPage<SuaSite> rs = suaSiteService.getSiteList(new Page<>(pageNum, pageSize), suaSiteSearchParam);
        return CommonResult.success(rs, "返回成功");
    }


    @ApiOperation("添加网站")
    @RequestMapping(value = "/addSite", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult addSite(@Validated @RequestBody SuaSiteAddParam suaSiteAddParam) {
        Boolean rs = suaSiteService.addSite(suaSiteAddParam);
        if (rs == true) {
            return CommonResult.success(rs, "返回成功");
        } else {
            System.out.println("hello");
            return CommonResult.failed("添加失败");
        }

    }


    @ApiOperation("获取网址详情")
    @RequestMapping(value = "/getSiteDetail", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getSiteDetail(@RequestParam(value = "id") Integer id) {
        List rs = suaSiteService.getSiteDetail(id);
        return CommonResult.success(rs, "返回成功");

    }



    @ApiOperation("修改网站")
    @RequestMapping(value = "/editSite", method = RequestMethod.PUT)
    @ResponseBody
    public CommonResult editSite(@Validated @RequestBody  SuaSite suaSite) {
        suaSiteService.editSite(suaSite);
        return CommonResult.success( "返回成功");
    }


    @ApiOperation("删除网站")
    @RequestMapping(value = "/delSite", method = RequestMethod.DELETE)
    @ResponseBody
    public CommonResult delSite(@RequestParam(value = "id") Integer id) {
        suaSiteService.delSite(id);
        return CommonResult.success("返回成功");
    }


}

