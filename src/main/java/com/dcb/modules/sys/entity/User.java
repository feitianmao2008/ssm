/**
 * **********************************************************************************************************
 * 版权声明：该软件的知识产权归深圳德卡股份有限公司所有。
 * Copyright Statement: The software intellectual property is owned by ShenZhen Decard SmartCard Tech Co.,Ltd.
 * **********************************************************************************************************
 */
package com.dcb.modules.sys.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author dcb 284850653@qq.com
 * @version 1.0
 * @description 类作用描述
 * @createDate 2018/9/14 11:47
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

    private String id;

    private String name;

    private String password;
}
