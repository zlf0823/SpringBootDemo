package xyz.zlflearn.springboot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author zhengLongfei
 * @date 2022-09-15-11:32
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@ConfigurationProperties(prefix = "stu")
@Component
public class Student {
    private Integer id;
    private String name;
    private String age;
    private String sex;
}
