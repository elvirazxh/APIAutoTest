package com.course.testng.multiThread;

/**
 * Created by admin on 2019/6/9.
 */

import org.testng.annotations.Test;

/**
 * @author zxh
 * @createTime 2019/6/9 14:51
 * @description
 */
public class MultiThreadOnXml {

    @Test
    public void test1(){
        System.out.printf("Thread Id is : %s%n",Thread.currentThread().getId());
    }

    @Test
    public void test2(){
        System.out.printf("Thread Id is : %s%n",Thread.currentThread().getId());
    }

    @Test
    public void test3(){
        System.out.printf("Thread Id is : %s%n",Thread.currentThread().getId());
    }

}

 
    