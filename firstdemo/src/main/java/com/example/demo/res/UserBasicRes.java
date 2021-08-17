package com.example.demo.res;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserBasicRes{

    @ApiModelProperty(value = "姓名" )
    private  Long name;

    @ApiModelProperty(value = "用户名" )
    private String userName;

    @ApiModelProperty(value = "密码")
    private  String password;
}
