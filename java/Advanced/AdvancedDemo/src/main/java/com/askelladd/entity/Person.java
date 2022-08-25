package com.askelladd.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private Integer id;
    private String name;

    public Integer rank;
    public String type;

    public Person(Integer id){
        this.id = id;
    }

    public void report(Integer id){
        System.out.println("id");
    }
}
