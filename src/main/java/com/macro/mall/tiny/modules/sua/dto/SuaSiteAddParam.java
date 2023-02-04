package com.macro.mall.tiny.modules.sua.dto;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotEmpty;

@Data
@EqualsAndHashCode(callSuper = false)
public class SuaSiteAddParam {
    @NotEmpty
    @ApiModelProperty(value = "网站名",required = true)
    private String name;
    @NotEmpty
    @ApiModelProperty(value = "网站类型",required = true)
    private String type;
    @NotEmpty
    @ApiModelProperty(value = "网站标签",required = true)
    private String tag;
    @NotEmpty
    @ApiModelProperty(value = "网站链接",required = true)
    private String url;

    @ApiModelProperty(value = "网站备注",required = false)
    private String note;


}
