package com.course.testng;/**
 * Created by admin on 2019/6/10.
 */

import org.testng.annotations.Test;

/**
 * @author zxh
 * @createTime 2019/6/10 10:16
 * @description
 */
public class TimeOutTest {
    @Test(timeOut = 5000)
    public void testSuccess() throws InterruptedException {
        Thread.sleep(3000);
    }


    @Test(timeOut = 2000)
    public void testFailed() throws InterruptedException {
        Thread.sleep(3000);
    }
}
 
    