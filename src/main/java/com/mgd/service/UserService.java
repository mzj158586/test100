package com.mgd.service;

import com.mgd.entity.User;

/**
 * @Description:
 * @Author: 梅广东
 * @CreateTime: 2021/9/7
 * @Company:
 */
public interface UserService {

    User selectUserById(Integer id,String name);


}
