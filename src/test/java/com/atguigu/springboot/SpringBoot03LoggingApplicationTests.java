package com.atguigu.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot03LoggingApplicationTests {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void contextLoads() {
//        System.out.println();

        //日志的级别，由低到高，日志指挥在这个级别和高级别上校
        logger.trace("这是tracr日志");
        logger.debug("这是debug日志");
        logger.info("这是info日志");
        logger.warn("这是warn信息");
        logger.error("这是error日志");

    }

}
