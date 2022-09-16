package xyz.zlflearn.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhengLongfei
 * @date 2022-09-14-10:49
 */
@Controller
public class HelloController {
    @GetMapping(value = "/hello")
    @ResponseBody
    public String hello(){
        return "Hello,World!";
    }
    @GetMapping(value = "/")
    public String welcome(Model model){
        model.addAttribute("welcome","我是2021级软件工程2班的郑龙飞,欢迎来到我的网站");
        return "hello";
    }

    @PostMapping("/test/con")
    @ResponseBody
    public String testCon(){
        return "---------get into testController------";
    }
}
