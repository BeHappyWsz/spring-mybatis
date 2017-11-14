package com.wsz.mybatis.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @Author wsz
 * @Des:
 * @Date: 2017/11/14
 */
public class Student implements Serializable {

    @Setter
    @Getter
    private int id;

    @Setter
    @Getter
    private String username;

    @Setter
    @Getter
    private String realName;

    @Setter
    @Getter
    private int age;

    @Setter
    @Getter
    private String des;
}
