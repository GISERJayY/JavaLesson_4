package com.yangjie.array;

import java.util.Arrays;

public class ArrayDemo7 {
    public static void main(String[] args) {
            int[] a = {6,8,3,2,1};
            int[] b = resort(a);
        System.out.println(Arrays.toString(b));
    }
    //冒泡排序
    //1、比较数组中，两个相邻的元素，如果一个数比第二个数大，我们就交换它们的位置。
    //2、每一次比较，都会产生一个最大，或者最小的数字
    //3、下一轮则可以少一次排序！
    //4、依次循环直到结束！

    public static int[] resort(int[] array){
        int temp = 0;//临时变量
        for (int i = 0; i < array.length-1; i++) {
            //内循环，比较判断两个数，如果第一个数比第二个数小，则交换位置
            boolean flag = false;//通过标识减少没有意义的比较
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j+1]>array[j]){
                     temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = true;
                }

            }
            if (flag==false){
                break;
            }
        }
        return array;
    }
}
