package com.example.demo.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class OrderTimeOutCancelTask {
    private Logger logger=  LoggerFactory.getLogger(OrderTimeOutCancelTask.class);

    @Scheduled(cron="0 0/1 * ? * ?")
    private void ScheuldTest(){
        logger.info("定时任务测试");
    }

}
