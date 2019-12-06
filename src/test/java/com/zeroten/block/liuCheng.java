package com.zeroten.block;

import org.testng.annotations.Test;

import java.util.Random;
import java.util.Scanner;

public class liuCheng {

    @Test
    public void testBlock(){
        int n1 = 100;
        {
            //int n1 = 100;  //外面已经定义了n1
            System.out.println(n1);
            int n2 = 101;
            System.out.println(n2);
        }
        //System.out.println(n2); //块的作用域只在块中,在块的外部无法访问
        int n2 = 102;
        System.out.println(n2);
    }

    @Test
    public void TestIfElse(){
        //        下面我们来做一个示例：给定一个年龄，然后判断该年龄属于儿童、青年、中年还是老年；
        //        年龄使用 int 类型，只支持整数。年龄段的划分规则如下：
        //
        //| 年龄范围  | 描述 |
        //| --------- | ---- |
        //| 0 ~ 6岁   | 儿童 |
        //| 7 ~ 17岁  | 少年 |
        //| 18 ~ 40岁 | 青年 |
        //| 41 ~ 59岁 | 中年 |
        //| 60及以上  | 老年 |
        Scanner sc = new Scanner(System.in);
        int age;
//        while(true) {
            age = 7;//sc.nextInt();
            if (age < 7) {
                System.out.println(age + "是儿童");
            } else if (age < 18) {
                System.out.println(age + "是少年");
            } else if (age < 41) {
                System.out.println(age + "是青年");
            } else if (age < 60) {
                System.out.println(age + "是中年");
            } else {
                System.out.println(age + "是老年");
            }
//        }
    }
    @Test
    public void testWhile(){
        //        练习：随机生成一个 `0 ～ 1000` 范围的整数，如果不能被30整除，
        //        则打印出数字，如果能被30整除则退出循环。生成 `0 ~ 1000` 范围
        //        的整数使用语句 `int r = new Random().nextInt(1000)`。
        boolean isGo = true;
        int n ;
        int times = 0;
        Random r = new Random();
        while(isGo){
            n = r.nextInt(1000);
            if (n % 30 == 0){
                System.out.println("随机数" + n + "可以被30整除,退出!");
                isGo = false;
            } else {
                System.out.println("随机数" + n + "不能被30整除,继续!");
                times++;
            }
        }
        System.out.println("此次共产生" + times + "个不能被30整除的数!");
    }

}
