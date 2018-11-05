package me.leohuachao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author leohuachao
 * @version V1.0
 * @Description: TODO
 * @date 2018/11/1
 */
@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class RestfulAPIWebDemo {
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    public static void main(String args[]) {
        SpringApplication.run(RestfulAPIWebDemo.class, args);
    }
}
