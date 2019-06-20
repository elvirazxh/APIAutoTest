package com.tester.model;/**
 * Created by admin on 2019/6/14.
 */

import lombok.Data;

/**
 * @author zxh
 * @createTime 2019/6/14 15:13
 * @description
 */

@Data
public class User {
    private int id;
    private String userName;
    private String password;
    private String age;
    private String sex;
    private String permission;
    private String isDelete;

    @Override
    public String toString(){
        return (
                "id:"+id+","+
                        "userName:"+userName+","+
                        "password:"+password+","+
                        "age:"+age+","+
                        "sex:"+sex+","+
                        "permission:"+permission+","+
                        "isDelete:"+isDelete+"}"
                );
    }
}

 
    