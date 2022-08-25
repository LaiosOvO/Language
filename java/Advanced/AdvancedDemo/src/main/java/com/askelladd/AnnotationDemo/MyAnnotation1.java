package com.askelladd.AnnotationDemo;

import com.askelladd.EnumDemo.Sex;
import com.sun.istack.internal.Nullable;

public @interface MyAnnotation1 {
    // 1 属性列表的返回值,  必须是一下类型
    // 基本数据类型   String  枚举  注解
    int attr() default 2;
    String attr1();
    Sex attr2();
    String[] attr3();
}