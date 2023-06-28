package com.yangjie.array;

public class ArrayDemo3 {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5,6};
        //打印全部数组元素
        for (int i=0;i<arrays.length;i++){
            System.out.print(arrays[i]+"\t");
        }
        System.out.println("\n"+"================");
        //打印所有元素的和
        int sum = 0;
        for (int i = 0; i < arrays.length; i++) {
            sum = arrays[i] + sum;
        }
        System.out.println(sum);
        //查找最大元素
        System.out.println("==============");
        int max = arrays[0];
        for (int i = 1; i < arrays.length; i++) {
            if (arrays[i]>max){
                max = arrays[i];
            }
        }
        System.out.println(max);
    }
}
