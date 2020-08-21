package com.binghuang.paypal_sdk.pluins;

/**
* @Description: 基础插件类，动态扩展处理类时需手动实现该类方法
* @Author: xianyu
* @Date: 11:36
*/
public interface BasePluins {

    Object invoke(Object data);

}
