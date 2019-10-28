package com.zwy.async.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

@Component
public class AsyncTask {

    @Async
    public Future<Boolean> doTask1() throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread.sleep(1000);
        long end = System.currentTimeMillis();
        System.out.println("任务1耗时：" + (end - start));
        return new AsyncResult<Boolean>(true);
    }

    @Async
    public Future<Boolean> doTask2() throws InterruptedException {
        long start2 = System.currentTimeMillis();
        Thread.sleep(700);
        long end2 = System.currentTimeMillis();
        System.out.println("任务2耗时：" + (end2 - start2));
        return new AsyncResult<Boolean>(true);
    }

    @Async
    public Future<Boolean> doTask3() throws InterruptedException {
        long start3 = System.currentTimeMillis();
        Thread.sleep(300);
        long end3 = System.currentTimeMillis();
        System.out.println("任务3耗时：" + (end3 - start3));
        return new AsyncResult<Boolean>(true);
    }

}
