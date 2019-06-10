package com.course.testng;/**
 * Created by admin on 2019/6/6.
 */

import org.testng.annotations.Test;

/**
 * @author zxh
 * @createTime 2019/6/6 23:35
 * @description
 */
public class DependTest {

    @Test
    public void test1(){
        System.out.println("test1 running");
        throw new RuntimeException();
    }

    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 running");
    }
}
 
    