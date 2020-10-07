package com.mao;

/*创建消息队列*/
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.core.Queue;



/*在启动时就被初始化*/
@Configuration
public class QueueConfig {
    //执行该类下的方法
    //创建队列
    @Bean
    public Queue createQueue(){
        return new Queue("hello-queue");
    }

}
