package cn.xydata.platform.system.provider.ampq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created by kaiqian on 2017/4/26.
 */
public class Sender {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Scheduled(fixedDelay = 10000L)
    public void send() {
        this.rabbitTemplate.convertAndSend("xydata.sample", "hello");
    }
}
