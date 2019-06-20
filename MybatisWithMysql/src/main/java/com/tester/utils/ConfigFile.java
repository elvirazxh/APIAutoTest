package com.tester.utils;/**
 * Created by admin on 2019/6/14.
 */

import com.tester.model.InterfaceName;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author zxh
 * @createTime 2019/6/14 15:40
 * @description
 */


//处理配置文件的类,获取接口的地址
public class ConfigFile {

    private static ResourceBundle bundle = ResourceBundle.getBundle("application", Locale.CHINA);

    public static String getUrl(InterfaceName name){
        String address = bundle.getString("test.url");
        String uri = "";
        String testUrl;

        if(name == InterfaceName.GETUSERLIST){
            uri = bundle.getString("getUserList.uri");
        }

        if(name == InterfaceName.LOGIN){
            uri = bundle.getString("login.uri");
        }

        if(name == InterfaceName.GETUSERINFO){
            uri = bundle.getString("getUserInfo.uri");
        }

        if(name == InterfaceName.ADDUSERINFO){
            uri = bundle.getString("addUser.uri");
        }

        if(name == InterfaceName.UPDATEUSERINFO){
            uri = bundle.getString("updateUserInfo.uri");
        }

        testUrl = address + uri;
        return testUrl;
    }
}
 
    