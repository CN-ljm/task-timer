package com.learn.core;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Created by liangjiaming on 2021/8/22
 * @title 基础数据结构
 * @Desc
 */
public class Grid {

    /**
     * 任务容器
     */
    private List<TimerTask> taskList = new LinkedList<>();

    public boolean addTask(TimerTask task) {
        return this.taskList.add(task);
    }

    public List<TimerTask> getTaskList() {
        return this.taskList;
    }

}
