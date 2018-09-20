/**
 * **********************************************************************************************************
 * 版权声明：该软件的知识产权归深圳德卡股份有限公司所有。
 * Copyright Statement: The software intellectual property is owned by ShenZhen Decard SmartCard Tech Co.,Ltd.
 * **********************************************************************************************************
 */
package com.dcb.core.orm.mybatis.dao;

import com.dcb.common.orm.persistence.CrudDao;
import com.dcb.core.orm.mybatis.entity.TreeEntity;

import java.util.List;

/**
 * @author dcb 284850653@qq.com
 * @version 1.0
 * @description DAO支持类实现
 * @createDate 2018/9/20 11:02
 */
public interface TreeDao<T extends TreeEntity<T>> extends CrudDao {

    /**
     * 找到所有子节点
     * @param entity
     * @return
     */
    List<T> findByParentIdsLike(T entity);

    /**
     * 更新所有父节点字段
     * @param entity
     * @return
     */
    int updateParentIds(T entity);

}
