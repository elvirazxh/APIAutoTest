package com.course.testng.groups;/**
 * Created by admin on 2019/6/6.
 */

import org.testng.annotations.Test;

/**
 * @author zxh
 * @createTime 2019/6/6 23:13
 * @description
 */

@Test(groups = "stu")
public class GroupsOnClass2 {

    public void stu1(){
        System.out.println("GroupsOnClass2中stu1运行");
    }

    public void stu2(){
        System.out.println("GroupsOnClass2中stu2运行");
    }
}
 
    