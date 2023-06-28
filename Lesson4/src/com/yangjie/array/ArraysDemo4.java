package com.yangjie.array;

public class ArraysDemo4 {
    public static void main(String[] args) {
        int[] arrarys = {1,2,3,4,5,6};
        //for each 循环
        //for (int i:arrarys
        //     ) {
        //    System.out.println(i);
        //}
        //printlnArrays(arrarys);
        int[] c = reversArrays(arrarys);
        for (int i:c
             ) {
            System.out.println(i);
        }
    }
    //反转元素
    public static int[] reversArrays(int[] arrays){
        int[] result = new int[arrays.length];
        for (int i = 0, j=arrays.length-1; i < arrays.length; i++,j--) {
          result[i] = arrays[j];

        }
        return result;  //返回元素
    }
    //打印数组元素
    public static void printlnArrays(int[] arrays){
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]+"\t");
        }
    }
}
