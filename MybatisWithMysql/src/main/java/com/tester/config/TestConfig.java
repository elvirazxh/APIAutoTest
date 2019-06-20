package com.tester.config;/**
 * Created by admin on 2019/6/14.
 */

import org.apache.http.client.CookieStore;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;

/**
 * @author zxh
 * @createTime 2019/6/14 15:37
 * @description
 */
//配置文件相关信息

public class TestConfig {

    public static String loginUrl;
    public static String updateUserInfoUrl;
    public static String getUserListUrl;
    public static String getUserInfoUrl;
    public static String addUserUrl;

    public static DefaultHttpClient defaultHttpClient;
    public static CookieStore cookieStore;


}
 
    