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
 * 
 * </p>
 *
 * @author suarez
 * @since 2023-01-31
 */
@Getter
@Setter
@TableName("sua_user")
@ApiModel(value = "SuaUser对象", description = "")
public class SuaUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("账号")
    private String username;

    @ApiModelProperty("密码")
    private String password;

    @ApiModelProperty("角色")
    private String roles;

    @ApiModelProperty("头像")
    private String avatar;

    @ApiModelProperty("介绍")
    private String introduction;

    @ApiModelProperty("邮箱")
    private String email;

    private String createdOn;

    private String createdBy;

    private String modifiedOn;

    private String modifiedBy;

    private String deletedOn;

    private String state;


}
