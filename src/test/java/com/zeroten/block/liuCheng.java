package com.zeroten.block;

import org.testng.annotations.Test;

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

}
