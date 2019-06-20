package com.tester.model;/**
 * Created by admin on 2019/6/14.
 */

import lombok.Data;

/**
 * @author zxh
 * @createTime 2019/6/14 15:15
 * @description
 */


@Data
public class AddUserCase {

    private String userName;
    private String password;
    private String sex;
    private String age;
    private String permission;
    private String isDelete;
    private String expected;
}
 
    