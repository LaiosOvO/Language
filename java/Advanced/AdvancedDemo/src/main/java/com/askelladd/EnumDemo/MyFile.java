package com.askelladd.EnumDemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyFile {

    private int id;
    private String name;
    private MyFileType type;

    public static void main(String[] args) {
        MyFile myFile = new MyFile(1, "2", MyFileType.TYPE_AUDIO);
        System.out.println(myFile);
    }
}
