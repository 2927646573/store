package com.cy.store.service;

import com.cy.store.entity.Address;

import java.util.List;

public interface IAddressService {
    void addNewAddress(Integer uid, String username, Address address);

    List<Address> getByUid(Integer uid);
    
    /**
     * 修改某个用户的某条收货地址数据为默认收货地址
     * @param aid 收货地址的id
     * @param uid 用户id
     * @param username 修改执行人
     */
    void setDefault(Integer aid,Integer uid,String username);
    
    /**
     * 删除用户选中的收货地址数据
     * @param aid 收货地址id
     * @param uid 用户id
     * @param username 用户名
     */
    void delete(Integer aid,Integer uid,String username);

    /**
     * 获取选中的收货地址的详细数据
     * @param aid 
     * @param uid
     * @return
     */
    Address getByAid(Integer aid, Integer uid);
}
