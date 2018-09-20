/**
 * **********************************************************************************************************
 * 版权声明：该软件的知识产权归深圳德卡股份有限公司所有。
 * Copyright Statement: The software intellectual property is owned by ShenZhen Decard SmartCard Tech Co.,Ltd.
 * **********************************************************************************************************
 */
package com.dcb.core.orm.mybatis.service;

import com.dcb.common.orm.persistence.CrudDao;
import com.dcb.core.orm.mybatis.entity.BaseEntity;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author dcb 284850653@qq.com
 * @version 1.0
 * @description 类作用描述
 * @createDate 2018/9/20 11:09
 */
public abstract class CrudService<D extends CrudDao<T>, T extends BaseEntity<T>> extends BaseService {

    /**
     * 持久层对象
     */
    @Autowired
    protected D dao;


}
