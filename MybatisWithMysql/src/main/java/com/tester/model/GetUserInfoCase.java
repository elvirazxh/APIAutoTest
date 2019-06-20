package com.tester.model;/**
 * Created by admin on 2019/6/14.
 */

import lombok.Data;

/**
 * @author zxh
 * @createTime 2019/6/14 15:20
 * @description
 */

@Data
public class GetUserInfoCase {
    private int id;
    private int userId;
    private String expected;
}
 
    