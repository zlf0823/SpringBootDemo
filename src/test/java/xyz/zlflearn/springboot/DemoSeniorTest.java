package xyz.zlflearn.springboot;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import xyz.zlflearn.springboot.bean.Student;

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
    }
    @Autowired
    private Student stu;
    @Test
    public void test1(){
        log.info(stu.toString());
    }
}
