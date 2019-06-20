package com.tester.model;/**
 * Created by admin on 2019/6/14.
 */

import lombok.Data;

/**
 * @author zxh
 * @createTime 2019/6/14 15:18
 * @description
 */

@Data
public class GetUserListCase {
    private String id;
    private String userName;
    private String age;
    private String sex;
    private String expected;
}
 
    