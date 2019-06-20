package com.tester.cases;/**
 * Created by admin on 2019/6/17.
 */

import com.tester.config.TestConfig;
import com.tester.model.AddUserCase;
import com.tester.model.User;
import com.tester.utils.DatabaseUtil;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.util.EntityUtils;
import org.apache.ibatis.session.SqlSession;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * @author zxh
 * @createTime 2019/6/17 15:49
 * @description
 */
public class AddUserTest {
    @Test(dependsOnGroups = "loginTrue",description = "添加用户接口接口")
    public void addUser() throws IOException, InterruptedException {

        SqlSession session = DatabaseUtil.getSqlSession();
        AddUserCase addUserCase = session.selectOne("addUserCase", 1);
        System.out.println(addUserCase.toString());
        System.out.println(TestConfig.addUserUrl);

        //发请求,获取结果
        String result = getResult(addUserCase);
        /**
         * 可以先讲
         */
        //查询用户看是否添加成功
        Thread.sleep(2000);
        //验证返回结果
        User user = session.selectOne("addUser",addUserCase);
        System.out.println(user.toString());
//        Assert.assertEquals(addUserCase.getExpected(),result);
    }



    private String getResult(AddUserCase addUserCase) throws IOException {
        HttpPost post = new HttpPost(TestConfig.addUserUrl);
        JSONObject patam = new JSONObject();
        patam.put("userName",addUserCase.getUserName());
        patam.put("password",addUserCase.getPassword());
        patam.put("age",addUserCase.getAge());
        patam.put("sex",addUserCase.getSex());
        patam.put("permission",addUserCase.getPermission());
        patam.put("isDelete",addUserCase.getIsDelete());

        //设置头信息
        post.setHeader("content-type","application/json");
        StringEntity entity = new StringEntity(patam.toString(),"utf-8");

        //设置cookie信息
        TestConfig.defaultHttpClient.setCookieStore(TestConfig.cookieStore);
        String result;//存放返回结果
        //执行post方法
        HttpResponse response = TestConfig.defaultHttpClient.execute(post);
        //获取响应结果
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        System.out.println(result);
        return result;
    }
}
 
    