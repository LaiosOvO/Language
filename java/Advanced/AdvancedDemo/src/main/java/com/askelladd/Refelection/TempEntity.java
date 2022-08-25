package com.askelladd.Refelection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@MyAnnotation3(age=123)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TempEntity {
    private Integer age;
    private String name;

    @MyAnnotation3(age=456)
    public void eat(){
        System.out.println("eat method is called");
    }
}
