package com.askelladd.AnnotationDemo;


import com.askelladd.EnumDemo.Sex;

@MyAnnotation1(attr = 1,attr1 = "value1",attr2= Sex.MALE,attr3 = {"1","2","3"})
public class TestAnnotationDemo1 {

    public static void main(String[] args) {

    }

    public static void method1(){

    }
}


class Cat{}