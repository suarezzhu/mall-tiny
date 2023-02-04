package com.macro.mall.tiny.modules.sua.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author suarez
 * @since 2023-02-04
 */
@Getter
@Setter
@TableName("sua_doc_detail")
@ApiModel(value = "SuaDocDetail对象", description = "")
public class SuaDocDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("名称")
    private String name;

    @ApiModelProperty("时间")
    private Date time;

    @ApiModelProperty("文档大小")
    private String docSize;

    @ApiModelProperty("标签")
    private String tag;

    @ApiModelProperty("文档文件夹id")
    private String typeId;

    @ApiModelProperty("内容")
    private String content;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("修改时间")
    private Date modifyTime;

    @ApiModelProperty("创建人id")
    private Integer createId;


}
