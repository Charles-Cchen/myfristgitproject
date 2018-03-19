package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
//注解activeProfiles可以指定需要用的配置文件
@ActiveProfiles("test")
public class MyTest {
    @Value("${whatconfig.msg}")
    private String msg;
    @Test
    public void testConfig() {
        System.out.println("cur msg is : "+ msg);
    }

    public String getMsg() {
        return msg;
    }
}
