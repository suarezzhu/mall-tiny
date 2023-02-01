package com.macro.mall.tiny.modules.sua.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 网站信息表
 * </p>
 *
 * @author suarez
 * @since 2023-01-31
 */
@Getter
@Setter
@TableName("sua_site")
@ApiModel(value = "SuaSite对象", description = "网站信息表")
public class SuaSite implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("名称")
    private String name;

    @ApiModelProperty("链接")
    private String url;

    @ApiModelProperty("备注")
    private String note;

    @ApiModelProperty("标签")
    private String tag;

    @ApiModelProperty("类型")
    private String typeId;

    private Integer createdOn;

    private Integer modifiedOn;

    private Integer deletedOn;


}
