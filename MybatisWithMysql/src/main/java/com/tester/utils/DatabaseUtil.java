package com.tester.utils;/**
 * Created by admin on 2019/6/14.
 */

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * @author zxh
 * @createTime 2019/6/14 16:01
 * @description
 */


//数据库文件配置读取和解析
public class DatabaseUtil {

    public static SqlSession getSqlSession() throws IOException{
        //获取配置的资源文件
        Reader reader = Resources.getResourceAsReader("databaseConfig.xml");
        //得到SqlSessionFactory，使用类加载器加载xml文件
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
        //得到sqlsession对象，这个对象就能执行配置文件中的sql语句啦
        SqlSession session = factory.openSession();

        return session;

    }
}
 
    