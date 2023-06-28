package com.yangjie.array;

import java.util.Arrays;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //静态初始化 创建 + 赋值
        int[] a = {1,2,3,5,7,8};//元素为基本类型
        System.out.println(a[4]);
        // Man[] mans = {new Man(),new Man()}; //元素为引用类型
        //动态初始化 包含默认初始值，初始值为 0
        int[] b = new int[5];
        b[0] = 1;
        b[2] = 3;
        for (int i : b) {
            System.out.println(i); //初始值为0，数组一个个符值
        }
        for (int i = 0;i<b.length;i++){
            System.out.print(b[i]+"\t"); //初始值为0，数组一个个符值
        }
    }
}
