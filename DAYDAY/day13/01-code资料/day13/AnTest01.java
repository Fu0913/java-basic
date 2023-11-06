package com.briup.day13;

//自定义注解
public @interface AnTest01 {
    public String value() default "hello";
}