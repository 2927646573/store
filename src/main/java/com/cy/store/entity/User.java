package com.cy.store.entity;

import lombok.Data;

import java.io.Serializable;

@Data
/** 用户数据的实体类 */
public class User extends BaseEntity implements Serializable {
    private Integer uid;
    private String username;
    private String password;
    private String salt;
    private String phone;
    private String email;
    private Integer gender;
    private String avatar;
    private Integer isDelete;

}
