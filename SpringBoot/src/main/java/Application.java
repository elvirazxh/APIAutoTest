/**
 * Created by admin on 2019/6/12.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author zxh
 * @createTime 2019/6/12 16:07
 * @description
 */

@SpringBootApplication
@ComponentScan("com.course")
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }


}
 
    