package cn.zealon;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfig
@EnableDubbo
public class DubboWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboWebApplication.class, args);
    }
}
