package com.zhangting.common.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @Author 张挺
 * @Description
 * @Date 2020/6/14 17:37
 */
@Data
public class LoginDTO {

    @NotBlank(message = "用户名不能为空")
    private String userName;

    @NotBlank(message = "密码不能为空")
    private String password;

}
