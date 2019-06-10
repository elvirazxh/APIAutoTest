package com.course.testng;/**
 * Created by admin on 2019/6/6.
 */

import org.testng.annotations.Test;
import org.testng.xml.dom.Reflect;

/**
 * @author zxh
 * @createTime 2019/6/6 23:27
 * @description
 */
public class ExpectTestException {

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是一个失败的异常测试");
    }


    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这是一个成功的异常测试");
        throw new RuntimeException();
    }
}
 
    