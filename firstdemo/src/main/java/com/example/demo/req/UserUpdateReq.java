package com.example.demo.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;

/**
 * 更新用户信息
 */
@Getter
@Setter
@ApiModel(description = "用户信息")
public class UserUpdateReq {

    @Id
    private Long id;

    @ApiModelProperty(value = "姓名" )
    private  String username;

    @ApiModelProperty(value = "用户名" )
    private String name;

    @ApiModelProperty(value = "密码")
    private  String password;
}
