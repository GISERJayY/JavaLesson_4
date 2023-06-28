package com.yangjie.array;
//变量的类型 变量的名字 = 变量的值
//数组类型
public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] numbers1; //1、声明一个数组
        //int numbers2[];
       numbers1 = new int[10];//2、创建一个数组
       numbers1[0]= 1;
       numbers1[1]= 2;
       numbers1[2]= 3;
       numbers1[3]= 4;
       numbers1[4]= 5;
       numbers1[5]= 6;
       numbers1[6]= 7;
       numbers1[7]= 8;
       numbers1[8]= 9;
       numbers1[9]= 10;
        //System.out.println(numbers1);
        int sum = 0;
        for (int i =0;i<numbers1.length;i++){
            sum = sum + numbers1[i];
          }
        System.out.println("总和为："+ sum);
    }

}
