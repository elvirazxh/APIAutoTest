package com.course.httpclient.demo;/**
 * Created by admin on 2019/6/11.
 */

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EncodingUtils;


import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;


import java.io.IOException;

/**
 * @author zxh
 * @createTime 2019/6/11 17:47
 * @description
 */
public class MyHttpClient {

    @Test
    public void test1() throws IOException {
        //存放结果
        String result;
        HttpGet get = new HttpGet("http://www.baidu.com");
        //用来执行get方法
        HttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        System.out.println(result);
    }
}
 
    