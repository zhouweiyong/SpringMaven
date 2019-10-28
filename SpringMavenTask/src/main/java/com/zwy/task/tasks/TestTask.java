package com.zwy.task.tasks;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class TestTask {

    private SimpleDateFormat format=new SimpleDateFormat("HH:mm:ss");
    //定义每过3秒执行一次任务
//    @Scheduled(fixedRate =3000)

    /**
     * 使用规则来定义定时任务
     * 定义规则地址：http://cron.qqe2.com/
     */
    @Scheduled(cron = "6-15 * * * * ? ")
    public void showTime(){
        System.out.println("现在时间是:"+format.format(new Date()));
    }
}
