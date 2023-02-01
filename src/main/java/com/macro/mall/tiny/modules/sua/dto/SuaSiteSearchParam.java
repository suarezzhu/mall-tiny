package com.macro.mall.tiny.modules.sua.dto;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotEmpty;

@Data
@EqualsAndHashCode(callSuper = false)
public class SuaSiteSearchParam {

    @ApiModelProperty(value = "网站名",required = false)
    private String name;

    @ApiModelProperty(value = "网站类型Id",required = false)
    private String type;

    @ApiModelProperty(value = "网站标签",required = false)
    private String tag;


}
