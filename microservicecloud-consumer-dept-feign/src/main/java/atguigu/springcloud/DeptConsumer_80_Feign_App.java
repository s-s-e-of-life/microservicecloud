package atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
// 添加注解,就能扫描到Feign定义的接口啦
@EnableFeignClients(basePackages = {"com.atguigu.springcloud"})
// 扫描指定的包
@ComponentScan("com.atguigu.springcloud")
public class DeptConsumer_80_Feign_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_80_Feign_App.class, args);
    }
}
