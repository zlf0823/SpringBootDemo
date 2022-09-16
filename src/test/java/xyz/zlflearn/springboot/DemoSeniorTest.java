package xyz.zlflearn.springboot;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import xyz.zlflearn.springboot.bean.Student;
import xyz.zlflearn.springboot.controller.HelloController;

/**
 * @author zhengLongfei
 * @date 2022-09-14-11:42
 */
@SpringBootTest
@Slf4j
public class DemoSeniorTest {

    @Test
    public void Test01(){
        System.out.println("hello2---Test2");
        System.out.println("hello3---Test3");
        System.out.println("hello4---Test4");
        System.out.println("master---Test");
        System.out.println("hot-fix---Test");
        System.out.println("master---Test2");
        System.out.println("pull---Test3");
    }
    @Autowired
    private Student stu;
    @Test
    public void test1(){
        log.info(stu.toString());
    }

    @Test
    public void test2(){
        log.info(stu.toString());
    }

    @Test
    public void testController() throws Exception {
        //创建mvc环境对象
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(HelloController.class).build();
        //初始化请求链接
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders
                .post("/test/con");
        //发送请求接受返回结果
        MvcResult mvcResult = mockMvc.perform(requestBuilder).andReturn();
        String message = mvcResult.getResponse().getContentAsString();
        log.info(message);
    }
}
