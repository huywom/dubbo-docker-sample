package com.alibaba.dubbo.test.docker;

/**
 * @author ken.lj
 * @date 2017/10/16
 */
public class DemoServiceImpl implements DemoService {
    public String hello(String str) {
        return "str";
    }
}
