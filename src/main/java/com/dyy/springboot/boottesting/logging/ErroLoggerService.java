package com.dyy.springboot.boottesting.logging;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
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
public class ErroLoggerService {

    @Scheduled(cron = "0 */1  * * * ?")
    public void logOutput() throws InterruptedException {
        log.error("ErroLoggerService 输出:{}", LocalDateTime.now());
    }
}
