/**
 * **********************************************************************************************************
 * 版权声明：该软件的知识产权归深圳德卡股份有限公司所有。
 * Copyright Statement: The software intellectual property is owned by ShenZhen Decard SmartCard Tech Co.,Ltd.
 * **********************************************************************************************************
 */
package com.dcb.core.orm.mybatis.entity;

import com.dcb.common.orm.persistence.AbstractBaseEntity;

/**
 * @author dcb 284850653@qq.com
 * @version 1.0
 * @description Entity支持类
 * @createDate 2018/9/20 10:10
 */
public abstract class BaseEntity<T> extends AbstractBaseEntity<T, String> {

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public void setId(String id) {
        super.setId(id);
    }
}
