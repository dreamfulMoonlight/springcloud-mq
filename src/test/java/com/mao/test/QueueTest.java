package com.mao.test;
/*
消息队列测试类
 */


import com.mao.Provider;
import com.mao.springcloudMqApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = springcloudMqApplication.class)
public class QueueTest {
    @Autowired
    private Provider provider;
    /*
    测试消息队列
     */
    @Test
    public void test1(){
        this.provider.send("Hello World msg");
    }
}
