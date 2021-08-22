package com.learn.core;

/**
 * @author Created by liangjiaming on 2021/8/22
 * @title 计时任务
 * @Desc
 */
public class TimerTask {

    /**
     * 开始时间
     */
    private long startTime;

    /**
     * 延迟执行（秒）
     */
    private long delay;

    /**
     * 间隔时间（秒）
     */
    private long interval;

    /**
     * 任务逻辑
     */
    private Runnable run;

    public TimerTask(long startTime, long delay, long interval, Runnable run) {
        this.startTime = startTime;
        this.delay = delay;
        this.interval = interval;
        this.run = run;
    }

    public TimerTask(Runnable run) {
        this.run = run;
    }

    public TimerTask(long startTime, Runnable run) {
        this.startTime = startTime;
        this.run = run;
    }

    public TimerTask(long startTime, long delay, Runnable run) {
        this.startTime = startTime;
        this.delay = delay;
        this.run = run;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getDelay() {
        return delay;
    }

    public long getInterval() {
        return interval;
    }

    public Runnable getRun() {
        return run;
    }
}
