/**
 * **********************************************************************************************************
 * 版权声明：该软件的知识产权归深圳德卡股份有限公司所有。
 * Copyright Statement: The software intellectual property is owned by ShenZhen Decard SmartCard Tech Co.,Ltd.
 * **********************************************************************************************************
 */
package com.dcb.core.orm.mybatis.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @author dcb 284850653@qq.com
 * @version 1.0
 * @description 数据Entity类
 * @createDate 2018/9/20 10:27
 */
public abstract class DataEntity<T> extends BaseEntity<T> {

    /**
     * 记录状态标志位
     */
    protected String status;

    /**
     * 操作版本(乐观锁,用于并发控制)
     */
    protected Integer version;

    /**
     * 记录创建者用户登录名
     */
    protected String createUser;
    /**
     * 记录创建时间
     */
    protected Date createTime;

    /**
     * 记录更新用户 用户登录名
     */
    protected String updateUser;
    /**
     * 记录更新时间
     */
    protected Date updateTime;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    @JsonFormat(pattern = DATE_TIME_FORMAT, timezone = TIMEZONE)
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    @JsonFormat(pattern = DATE_TIME_FORMAT, timezone = TIMEZONE)
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
