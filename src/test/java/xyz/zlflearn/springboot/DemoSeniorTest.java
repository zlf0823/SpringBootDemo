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
        System.out.println("hello---Test");
    }
    @Autowired
    private Student stu;
    @Test
    public void test1(){
        log.info(stu.toString());
    }
}
