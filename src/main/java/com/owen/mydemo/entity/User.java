package com.owen.mydemo.entity;

/**
 * Author:  wen
 * Date:    2024/3/19
 * Desc:    user
 */
public class User {
    private String name;
    private long id;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
