/**
 * **********************************************************************************************************
 * 版权声明：该软件的知识产权归深圳德卡股份有限公司所有。
 * Copyright Statement: The software intellectual property is owned by ShenZhen Decard SmartCard Tech Co.,Ltd.
 * **********************************************************************************************************
 */
package com.dcb.common.orm.persistence;

import java.io.Serializable;

/**
 * @author dcb 284850653@qq.com
 * @version 1.0
 * @description 抽象基类
 * @createDate 2018/9/20 10:07
 */
public abstract class AbstractBaseEntity<T, PK extends Serializable>{

    public static final String DATE_FORMAT = "yyyy-MM-dd";

    public static final String TIME_FORMAT = "HH:mm:ss";

    public static final String TIME_SHORT_FORMAT = "HH:mm";

    public static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public static final String DATE_TIME_SHORT_FORMAT = "yyyy-MM-dd HH:mm";

    public static final String TIMESTAMP_FORMAT = "yyyy-MM-dd HH:mm:ss.S";

    public static final String TIMEZONE = "GMT+08:00";

    /**
     * 实体编号（唯一标识）
     */
    protected PK id;

    public PK getId() {
        return id;
    }

    public void setId(PK id) {
        this.id = id;
    }
}
