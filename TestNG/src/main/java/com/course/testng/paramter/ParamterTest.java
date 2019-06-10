package com.course.testng.paramter;/**
 * Created by admin on 2019/6/6.
 */

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author zxh
 * @createTime 2019/6/6 23:43
 * @description
 */
public class ParamterTest {

    @Test
    @Parameters({"name","age"})
    public void paramterTest1(String name,String age){
        System.out.println("name = " + name + "age = " + age);
    }
}
 
    