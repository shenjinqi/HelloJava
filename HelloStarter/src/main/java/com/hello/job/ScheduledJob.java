package com.hello.job;

import com.hello.util.LogUtil;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@Async
public class ScheduledJob {
    @Async
    @Scheduled(cron = "0/11 * * * * *")
    public void scheduledCron() {
        LogUtil.info("cron", new Date());
    }

    @Scheduled(fixedRate = 1000 * 17)
    public void scheduledRate() {
        LogUtil.info("fixedRate", new Date());
    }

    @Scheduled(fixedDelay = 1000 * 19)
    public void scheduledDelay() {
        LogUtil.info("fixedDelay", new Date());
    }
}
