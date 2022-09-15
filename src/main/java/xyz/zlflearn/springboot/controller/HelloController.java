package xyz.zlflearn.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhengLongfei
 * @date 2022-09-14-10:49
 */
@RestController
public class HelloController {
    @GetMapping(value = "/hello")
    public String hello(){
        return "Hello,World!";
    }
}
