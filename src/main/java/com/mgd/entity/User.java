package com.mgd.entity;

import java.io.Serializable;

/**
 * @Description:
 * @Author: 梅广东
 * @CreateTime: 2021/9/7
 * @Company:
 */
public class User implements Serializable {

    private Integer id;
    private  String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
