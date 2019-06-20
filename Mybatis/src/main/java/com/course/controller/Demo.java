package com.course.controller;/**
 * Created by admin on 2019/6/13.
 */

import com.course.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @author zxh
 * @createTime 2019/6/13 18:51
 * @description
 */

//@Log4j
@RestController
@Api(value = "v1",description = "这是我的第一个版本的demo")
@RequestMapping("v1")
public class Demo {

    //首先获取一个执行SQL语句对象
    @Autowired
    protected SqlSessionTemplate template;

    @RequestMapping(value = "/getUserCount",method = RequestMethod.GET)
    @ApiOperation(value = "可以获取到用户数",httpMethod = "GET")
    public int getUserCount(){
        return template.selectOne("getUserCount");
    }

    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public int addUser(@RequestBody User user){
        int result = template.insert("addUser",user);
        return result;
    }

    @RequestMapping(value="/updateUser",method = RequestMethod.POST)
    public int updateUser(@RequestBody User user){
        int result = template.insert("updateUser",user);
        return result;
    }

//    @RequestMapping(value = "/deleteUser",method = RequestMethod.GET)
//    public int deleteUser(@RequestBody int id) {
//        int result = template.delete("deleteUser", id);
//        return result;
//    }


    @RequestMapping(value = "/deleteUser",method = RequestMethod.GET)
    public int delUser(@RequestParam int id){
        return template.delete("deleteUser",id);
    }







}
 
    