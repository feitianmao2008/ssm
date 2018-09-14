/**
 * **********************************************************************************************************
 * 版权声明：该软件的知识产权归深圳德卡股份有限公司所有。
 * Copyright Statement: The software intellectual property is owned by ShenZhen Decard SmartCard Tech Co.,Ltd.
 * **********************************************************************************************************
 */
package com.dcb.modules.sys.controller;

import com.dcb.modules.sys.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dcb 284850653@qq.com
 * @version 1.0
 * @description 类作用描述
 * @createDate 2018/9/14 11:46
 */
@Controller
public class UserController {

    @RequestMapping("/users")
    @ResponseBody
    public List<User> getList() {
        ArrayList<User> users = new ArrayList();
        users.add(new User("1", "name1", "password1"));
        users.add(new User("2", "name2", "password2"));
        users.add(new User("3", "name3", "password3"));
        users.add(new User("4", "name4", "password4"));
        return users;
    }
}
