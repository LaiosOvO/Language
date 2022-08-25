package com.askelladd.Refelection;

import com.askelladd.entity.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
//        GetFieldMethod();
//        getConstructorMethod();
//        GetMemberMethod();
        RefelectSetValue();
    }

    public static void method1() throws ClassNotFoundException {
        Class<?> aClass = Class.forName("com.askelladd.entity.Person");

        Class<Person> personClass = Person.class;

        Person person = new Person();
        Class<? extends Person> aClass1 = person.getClass();

        System.out.println(aClass == aClass1);
    }

    public static void GetFieldMethod() throws NoSuchFieldException, IllegalAccessException {
        /*
        *   Field[] getFields()                 获取所有public修饰的成员变量
        *   Field getField(String name)         获取指定名称的 public修饰的成员变量
        *   Field[] getDeclaredFields()         获取所有成员变量不考虑修饰符
        *   Field getDeclaredField(String name)
        * */
        Class<Person> personClass = Person.class;
        // getFields()
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        //  getDeclaredFields()
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

        System.out.println("\n\n==================================================\n\n");

        //  getField()
        Field name = personClass.getField("rank");
        System.out.println(name);
        //  getDeclaredField()
        Field declaredField = personClass.getDeclaredField("rank");
        System.out.println(declaredField);

        System.out.println("\n\n==================================================\n\n");
        System.out.println("用反射机制   为对象设置值");

        Person person = new Person();
        Field rank = personClass.getField("rank");
        rank.set(person, 123);      // 设置值
        System.out.println(rank.get(person));

        Field name1 = personClass.getField("name");
        name1.setAccessible(true);
    }

    public static void getConstructorMethod() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        /*
        *   Constructor<?>[] getConstructors()                                  获取所有公共的构造方式
        *   Constructor<T> getConstructor(Class<?>... parameterTypes)
        *   Constructor<T> getDecalaredConstructor(Class<?>... parameterTypes)
        *   Constructor<?>[] getDeclaredConstructors()
        * */
        Class<Person> personClass = Person.class;
        Constructor<?>[] constructors = personClass.getConstructors();
        for (Constructor<?> ite1 : constructors) {
            System.out.println(ite1);
        }

        Constructor<Person> constructor = personClass.getConstructor(Integer.class);
        System.out.println(constructor);

        Constructor<?>[] declaredConstructors = personClass.getDeclaredConstructors();
        for (Constructor<?> ite2 : declaredConstructors) {
            System.out.println(ite2);
        }

        Constructor<Person> declaredConstructor = personClass.getDeclaredConstructor(Integer.class);
        System.out.println(declaredConstructor);


        System.out.println("\n\n==================================================\n\n");
        System.out.println("Constructor 创建对象;即利用反射创建对象");
        Person person = new Person();
        Constructor<Person> constructor1 = personClass.getConstructor(Integer.class);
        Person person1 = constructor1.newInstance(1);
        System.out.println(person1);
    }

    public static void GetMemberMethod() throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        /*
        *   Method[] getMethods()
        *   Method getMethod(String name,Class<?>... parameterTypes)
        *   Method[] getDeclaredMethods()
        *   Method getDeclaredMethod(String name,Class<?>... parameterTypes)
        *  */
        Class<Person> personClass = Person.class;

        Method[] methods = personClass.getMethods();
        for (Method ite : methods) {
            System.out.println(ite);
        }

        Method report = personClass.getMethod("report", Integer.class);
        System.out.println(report);

        // getDeclaredMethods()     getDeclaredMethod()同理
        System.out.println("\n\n==================================================\n\n");
        System.out.println("利用反射调用方法");

        Method report1 = personClass.getMethod("report", Integer.class);
        System.out.println(report1);
        Person person = personClass.newInstance();
        report1.invoke(person,1);
    }

    public static void RefelectSetValue() throws NoSuchMethodException {
        Class<TempEntity> tempEntityClass = TempEntity.class;

        // 获取 打在类上的注解   的值
        boolean annotationPresent = tempEntityClass.isAnnotationPresent(MyAnnotation3.class);
        if(annotationPresent){
            MyAnnotation3 annotation = tempEntityClass.getAnnotation(MyAnnotation3.class);
            int age = annotation.age();
            System.out.println(age);
        }

        // 获取   打在方法上   注解的值
        Method eat = tempEntityClass.getMethod("eat");
        boolean annotationPresent1 = eat.isAnnotationPresent(MyAnnotation3.class);
        if (annotationPresent1){
            MyAnnotation3 annotation = eat.getAnnotation(MyAnnotation3.class);
            int age = annotation.age();
            System.out.println(age);
        }
    }

}
