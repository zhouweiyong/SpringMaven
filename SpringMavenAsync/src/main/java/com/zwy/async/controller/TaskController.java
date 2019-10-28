package com.zwy.async.controller;

import com.zwy.async.async.AsyncTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.Future;

@Controller
public class TaskController {
    //一定要使用注入，异步才会有效，不知道什么原理
    @Autowired
    private AsyncTask task;

    @RequestMapping("/task")
    public void doTask() {

        long start = System.currentTimeMillis();
        try {
            Future<Boolean> task1 = task.doTask1();
            Future<Boolean> task2 = task.doTask2();
            Future<Boolean> task3 = task.doTask3();

            while (!task1.isDone() || !task2.isDone() || !task3.isDone()) {
                if (task1.isDone() && task2.isDone() && task3.isDone()) {
                    break;
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("任务总耗时：" + (end - start));
    }
}
