package com.zeroten.block;

import org.testng.annotations.Test;

public class BiJiStudy {

    @Test
    public void testIntArray(){
        int[] arr = new int[10]; //new int[10] 会将int数组10个元素初始化为0
        System.out.println(arr);
        for (int i = 0; i < arr.length; i++ ){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        int[] arr2 = {12,2156,543,315,25,145,53};
        for ( int i = 0 ; i < arr2.length ; i++ ){
            System.out.print(arr2[i] + "\t");
        }

    }

    @Test
    public void testNiMingDuiXiang(){
        new SmarlCar().run(); //创建匿名对象,多用于执行一次类中的方法,如果需要多次使用类中的方法,不建议这么用
    }
}

class Car {
    public static int age;
    public String name;

    public static void testStatic(){
        Car.testStatic2();
        testStatic2();
        age = 555;
//        name = "张三";  //静态方法中不能调用非静态成员变量和方法,因为他们是依赖类的对象存在
//        run();
//        this.age;      //也不会出现this,因为this代表当前对象,二静态成员变量和静态方法不依赖对象二存在,随着类的加载而加载
    }

    public static void testStatic2(){

    }

    public void testStatic3(){
        Car.age = 5;
        this.age = 6;   //而在非静态方法中可以调用,这三种都可以使用
        age = 7;
    }

    public Car(){
        System.out.println("我是无参构造函数"); //类的构造函数没有void和返回值
    }
    public void run(){
        System.out.println("我在跑,来追我啊");
    }

    public int run(int time){   //方法重载与方法返回值无关,与方法参数个数.类型相关
        return time;
    }

    public void run(String s){

    }
}

class SmarlCar extends Car{   //继承Car,在创建SmarlCar会默认调用父类的无参构造函数

    public SmarlCar(){
        System.out.println("我是小轿车");
    }
    public void run(){

        System.out.println("我是小轿车我跑的更快");
        super.run();
    }
}