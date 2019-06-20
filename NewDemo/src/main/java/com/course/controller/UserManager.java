package com.course.controller;/**
 * Created by admin on 2019/6/17.
 */
import com.course.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Objects;

/**
 * @author zxh
 * @createTime 2019/6/17 17:25
 * @description
 */
@RestController
@Api(value = "v1",description = "用户管理系统")
@RequestMapping("v1")
public class UserManager {

    private Logger logger = LoggerFactory.getLogger(UserManager.class);

//    首先获取一个执行sql语句的对象
    @Autowired
    private SqlSessionTemplate template;


    @ApiOperation(value = "登录接口",httpMethod = "POST")
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Boolean login(HttpServletResponse response, @RequestBody User user){
        int i  = template.selectOne("login",user);
        Cookie cookie = new Cookie("login","true");
        response.addCookie(cookie);
        logger.info("查看到的结果是"+i);
        if(i==1) return true;

        return false;
    }

    @ApiOperation(value = "添加用户接口",httpMethod = "POST")
    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public Boolean addUser(HttpServletRequest request,@RequestBody User user)  {
        Boolean info = verifyCookies(request);
        int result = 0;
        if(info != null){
            result = template.insert("addUser",user);
        }
        if(result>0){
            logger.info("添加用户的数据是:"+result);
            return true;
        }
        return false;
    }




    @ApiOperation(value = "获取用户(列表)信息接口",httpMethod = "POST")
    @RequestMapping(value = "/getUserInfo",method = RequestMethod.POST)
    public List<User> getUserInfo(HttpServletRequest request,@RequestBody User user){
        Boolean info = verifyCookies(request);
        if(info==true){
            List<User> users = template.selectList("getUserInfo",user);
            logger.info("getUserInfo获取到的用户数量是" +users.size());
            return users;
        }else {
            return  null;
        }
    }


    @ApiOperation(value = "更新/删除用户接口",httpMethod = "POST")
    @RequestMapping(value = "/updateUserInfo",method = RequestMethod.POST)
    public int updateUser(HttpServletRequest request,@RequestBody User user){
        Boolean info = verifyCookies(request);
        int i=0;
        if(info==true){
            i = template.update("updateUserInfo",user);
        }
        logger.info("更新数据的条目数为:" + i);
        return i;
    }

    //验证cookie是否有效
    private Boolean verifyCookies(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        if (Objects.isNull(cookies)){
            logger.info("cookies 为空");
            return false;
        }
        for (Cookie cookie:cookies){
            if (cookie.getName().equals("login")
                    && cookie.getValue().equals("true")) {
                logger.info("cookies验证通过");
                return true;
            }
        }
        return false;
    }

}
 
























