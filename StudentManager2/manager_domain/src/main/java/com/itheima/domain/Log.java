package com.itheima.domain;

import java.util.Date;

/**
 * @author 刘玉保
 * @date 2019/07/15 下午 4:27
 */
@SuppressWarnings("all")
public class Log {
    //    日志编号
    private Integer id;
    //    用户名
    private String name;
    //    当前时间
    private Date time;
    //    访问路径
    private String url;
    //    用时
    private Integer cost;

    public Log() {
    }

    public Log(Integer id, String name, String url, Integer cost, Date time) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.cost = cost;
        this.time = time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "日志 {" +
                "编号:" + id +
                ",姓名:" + name +
                ",路径:" + url +
                ",用时:=" + cost +
                ",时间:" + time +
                '}';
    }
}
