package com.dcb.common.orm.persistence;

import java.util.List;

/**
 * @author dcb 284850653@qq.com
 * @version 1.0
 * @description DAO支持类实现
 * @createDate 2018/9/20 10:59
 */
public interface CrudDao<T> extends BaseDao {

    /**
     * 获取单条数据
     * @param id
     * @return
     */
    T get(String id);

    /**
     * 获取单条数据
     * @param entity
     * @return
     */
    T get(T entity);

    /**
     * 查询数据列表，如果需要分页，请设置分页对象，如：entity.setEntityPage(new Page<T>());
     * @param entity
     * @return
     */
    List<T> findList(T entity);

    /**
     * 查询所有数据列表
     * @param entity
     * @return
     */
    List<T> findAllList(T entity);

    /**
     * 查询所有数据列表
     * @see public List<T> findAllList(T entity)
     * @return
     */
    @Deprecated
    List<T> findAllList();

    /**
     * 插入数据
     * @param entity
     * @return
     */
    int insert(T entity);

    /**
     * 更新数据
     * @param entity
     * @return
     */
    int update(T entity);

    /**
     * 删除数据（一般为逻辑删除，更新status字段为1）
     * @param id
     * @see public int DELETE(T entity)
     * @return
     */
    @Deprecated
    int delete(String id);

    /**
     * 删除数据（一般为逻辑删除，更新status字段为1）
     * @param entity
     * @return
     */
    int delete(T entity);
}