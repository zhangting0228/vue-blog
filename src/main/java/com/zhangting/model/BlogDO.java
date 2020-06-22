package com.zhangting.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author 张挺
 * @Description
 * @Date 2020/6/14 17:47
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "BLOG")
public class BlogDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_")
    private String id;

    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "TITLE_")
    private String title;

    @Column(name = "DESCRIPTION_")
    private String description;

    @Column(name = "CONTENT_")
    private String content;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "STATUS")
    private String status;

}
