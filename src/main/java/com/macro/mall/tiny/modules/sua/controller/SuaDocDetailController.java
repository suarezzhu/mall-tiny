package com.macro.mall.tiny.modules.sua.controller;


import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.modules.sua.model.SuaDocDetail;
import com.macro.mall.tiny.modules.sua.model.SuaSite;
import com.macro.mall.tiny.modules.sua.service.SuaDocDetailService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author suarez
 * @since 2023-02-04
 */
@RestController
@RequestMapping("/sua/suaDoc")
public class SuaDocDetailController {

    @Autowired
    SuaDocDetailService suaDocDetailService;

    @ApiOperation("增加文档内容")
    @RequestMapping(value = "/addDoc", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult addDoc(@Validated @RequestBody SuaDocDetail suaDocDetail) {
        suaDocDetailService.addDoc(suaDocDetail);
        return CommonResult.success( "返回成功");
    }


    @ApiOperation("更新文档内容")
    @RequestMapping(value = "/editDoc", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult editDoc(@Validated @RequestBody SuaDocDetail suaDocDetail) {
        suaDocDetailService.editDoc(suaDocDetail);
        return CommonResult.success( "返回成功");
    }







    @ApiOperation("获取文件夹的结构")
    @RequestMapping(value = "/getFolder", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getFolder() {
       List rs= suaDocDetailService.getFolder();
        return CommonResult.success( rs,"返回成功");
    }
    @ApiOperation("获取单个文件夹下的文件列表")
    @RequestMapping(value = "/getDocListByFolder", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getDocListByFolder(@Validated @RequestParam Integer id) {
        List rs= suaDocDetailService.getDocListByFolder(id);
        return CommonResult.success( rs,"返回成功");
    }

    @ApiOperation("获取单个文件详情")
    @RequestMapping(value = "/getDocDetail", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getDocDetail(@Validated @RequestParam Integer id) {
        Map map= suaDocDetailService.getDocDetail(id);
        return CommonResult.success( map,"返回成功");
    }

    @ApiOperation("删除文件")
    @RequestMapping(value = "/deleteDoc", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult deleteDoc(@Validated @RequestParam Integer id) {
        suaDocDetailService.deleteDoc(id);
        return CommonResult.success( "返回成功");
    }

    @ApiOperation("删除文件夹")
    @RequestMapping(value = "/deleteFolder", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult deleteFolder(@Validated @RequestParam Integer id) {
        suaDocDetailService.deleteFolder(id);
        return CommonResult.success( "返回成功");
    }

}

