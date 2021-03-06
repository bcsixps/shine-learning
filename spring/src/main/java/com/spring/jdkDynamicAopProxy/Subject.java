package com.spring.jdkDynamicAopProxy;

/**
 * @author 7le
 * @Description: 抽象角色（动态代理只能代理接口）
 * @date 2017年4月11日
 */
public interface Subject {

    void request();

    void doSomething();

}
