package com.dyy.springboot.boottesting.logging.group;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * @author Dongyangyang
 * @description
 * @date:2024/1/13
 * @mail yangyang.dong@kuwo.cn
 */
@Slf4j
@Service
public class GroupInfoLoggerService {

//    @Scheduled(cron = "0 */1  * * * ?")
    public void logOutput() throws InterruptedException {
        log.info("GroupInfoLoggerService 输出:{}", LocalDateTime.now());
    }
}
