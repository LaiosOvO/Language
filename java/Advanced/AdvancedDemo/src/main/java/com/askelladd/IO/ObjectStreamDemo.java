package com.askelladd.IO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/8/24 21:03
 * @PackageName:com.askelladd.IO
 * @ClassName: ObjectStreamDemo
 * @Description: TODO
 * @Version 1.0
 */
public class ObjectStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        TransferObject();
        LoadObject();
    }

    public static void TransferObject() throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("./order.dat"));
        Order order = new Order(1, "2");
        objectOutputStream.writeObject(order);
        objectOutputStream.close();
    }

    public static void LoadObject() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("./order.dat"));
        Order o = (Order)objectInputStream.readObject();
        System.out.println(o);

        objectInputStream.close();
    }

}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Order implements Serializable {
    private static final long serialVersionUID = 6284260950997027597L;

    private Integer code;
    private String name;
}