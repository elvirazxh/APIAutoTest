package com.course.testng.groups;/**
 * Created by admin on 2019/6/6.
 */

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * @author zxh
 * @createTime 2019/6/6 22:55
 * @description
 */

//组测试中的方法分组测试
public class GroupsOnMethod {

    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端组的测试方法11111");
    }

    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端组的测试方法222222");
    }


    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端组的测试方法11111");
    }

    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端组的测试方法222222");
    }

    @BeforeGroups("server")
    public void beforeGroupsOnerverMethod(){
        System.out.println("这是运行在服务端测试组之前运行的方法");
    }

    @AfterGroups("server")
    public void afterGroupsOnServerMethod(){
        System.out.println("这是运行在服务端测试组之后运行的方法");
    }

    @BeforeGroups("client")
    public void beforeGroupsOnClientMethod(){
        System.out.println("这是运行在客户端测试组之前运行的方法");
    }

    @AfterGroups("client")
    public void afterGroupsOnClientMethod(){
        System.out.println("这是运行在客户端测试组之后运行的方法");
    }
}
 
    