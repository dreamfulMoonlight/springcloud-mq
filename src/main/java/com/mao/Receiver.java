package com.mao;

/*消息接收者*/

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {
    //接收消息的方法，采用消息队列监听机制
    //事件通知触发方法
    @RabbitListener(queues ="hello-queue")
    public void getMsg(String msg){
        System.out.println("收到:"+msg);
    }
}
