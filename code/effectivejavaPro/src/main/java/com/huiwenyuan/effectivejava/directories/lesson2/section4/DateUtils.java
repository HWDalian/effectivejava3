package com.huiwenyuan.effectivejava.directories.lesson2.section4;

/**
 * 慧文院
 * 工具类通过私有化构造器强化其不可被实例化的能力
 * 简单来讲：我们工作中经常需要写一些不需要实例化的工具类
 * 这里使用私有构造器，抛出AssertionError异常，这样就可以避免该类内部不小心调用，也可以确认该类在任何情况下都不可被实例化
 */
public class DateUtils {

    private DateUtils() {
        throw new AssertionError();
    }
}
