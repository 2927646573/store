package com.cy.store.entity;

import lombok.Data;

import java.io.Serializable;

@Data
/** 商品数据的实体类 */
public class Product extends BaseEntity implements Serializable {
    private Integer id;
    private Integer categoryId;
    private String itemType;
    private String title;
    private String sellPoint;
    private Long price;
    private Integer num;
    private String image;
    private Integer status;
    private Integer priority;

}
