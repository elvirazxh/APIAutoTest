package com.course.testng;/**
 * Created by admin on 2019/6/6.
 */

import org.testng.annotations.Test;

/**
 * @author zxh
 * @createTime 2019/6/6 19:02
 * @description
 */

public class IgnoreTest {

    @Test
    public void ignore1(){
        System.out.println("ignore1 执行！");
    }

    @Test(enabled = false)
    public void ignore2(){
        System.out.println("ignore2 执行");
    }

    @Test(enabled = true)
    public void ignore3(){
        System.out.println("ignore3 执行");
    }
    
}
 
    