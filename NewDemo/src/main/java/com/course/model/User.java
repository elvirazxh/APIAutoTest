package com.course.model;/**
 * Created by admin on 2019/6/17.
 */

import lombok.Data;

/**
 * @author zxh
 * @createTime 2019/6/17 17:16
 * @description
 */

@Data
public class User {
    private int id;
    private String userName;
    private String password;
    private String age;
    private String sex;
    private String permission;
    private String isDelete;
}
 
    