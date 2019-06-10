package com.course.testng.multiThread;/**
 * Created by admin on 2019/6/9.
 */

import org.testng.annotations.Test;



/**
 * @author zxh
 * @createTime 2019/6/9 14:41
 * @description
 */
public class MultiThreadOnAnnotion {

    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test(){
        System.out.println(1);
        System.out.printf("Thread Id : %s%n", Thread.currentThread().getId());

    }
}
 
    