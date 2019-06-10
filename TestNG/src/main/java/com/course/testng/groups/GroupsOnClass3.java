package com.course.testng.groups;/**
 * Created by admin on 2019/6/6.
 */

import org.testng.annotations.Test;

/**
 * @author zxh
 * @createTime 2019/6/6 23:14
 * @description
 */


@Test(groups = "teacher")
public class GroupsOnClass3 {
    public void teacher1(){
        System.out.println("GroupsOnClass3中teacher1运行");
    }

    public void teacher2(){
        System.out.println("GroupsOnClass3中teacher2运行");
    }
}
 
    