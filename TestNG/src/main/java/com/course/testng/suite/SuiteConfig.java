package com.course.testng.suite;/**
 * Created by admin on 2019/6/6.
 */

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * @author zxh
 * @createTime 2019/6/6 18:40
 * @description
 */


public class SuiteConfig {

    @BeforeSuite
    public void beforeSuit(){
        System.out.println("before suite running");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("after suite running");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("afterTest");
    }


}
 
    