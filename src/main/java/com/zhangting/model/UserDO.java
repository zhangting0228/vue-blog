package com.zhangting.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author 张挺
 * @Description
 * @Date 2020/6/14 18:05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "USER")
public class UserDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_")
    private String id;

    @NotBlank(message = "用户名不能为空")
    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "AVATAR_")
    private String avatar;

    @NotBlank(message = "邮箱不能为空")
    @Email(message = "邮箱格式不正确")
    @Column(name = "EMAIL_")
    private String email;

    @Column(name = "STATUS_")
    private String status;

    @Column(name = "PASSWORD_")
    private String password;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "LAST_LOGIN_TIME")
    private Date lastLoginTime;
}
