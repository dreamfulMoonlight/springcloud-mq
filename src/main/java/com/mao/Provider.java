package com.mao;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*消息发送者*/
@Component
public class Provider {
    //利用封装的操作接口模板进行操作
    @Autowired
    private AmqpTemplate rabbitAmqpTemplate;
    //发送消息的方法
    public void send(String msg)
    {
        //向队列发送消息
        //参数一：队列的名称
        //参数二：消息
        this.rabbitAmqpTemplate.convertAndSend("hello-queue",msg);
    }
}
