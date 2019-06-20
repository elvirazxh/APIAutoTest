/**
 * Created by admin on 2019/6/17.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author zxh
 * @createTime 2019/6/17 16:52
 * @description
 */

@EnableScheduling
@SpringBootApplication
@ComponentScan("com.course")
public class MyApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class,args);
    }

}
 
    