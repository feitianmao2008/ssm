/**
 * **********************************************************************************************************
 * 版权声明：该软件的知识产权归深圳德卡股份有限公司所有。
 * Copyright Statement: The software intellectual property is owned by ShenZhen Decard SmartCard Tech Co.,Ltd.
 * **********************************************************************************************************
 */
package com.dcb.core.orm.mybatis.entity;

/**
 * @author dcb 284850653@qq.com
 * @version 1.0
 * @description 树形Entity基类
 * @createDate 2018/9/20 10:48
 */
public abstract class TreeEntity<T> extends DataEntity<T> {

    /**
     * 父级编号
     */
    protected T parent;
    /**
     * 所有父级编号
     */
    protected String parentIds;
    /**
     * 名称
     */
    protected String name;
    /**
     * 排序
     */
    protected Integer sort;



}
