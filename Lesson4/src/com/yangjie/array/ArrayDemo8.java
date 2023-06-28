package com.yangjie.array;

public class ArrayDemo8 {
    public static void main(String[] args) {
        int[][] array1 = new int[11][11];
        array1[1][2] = 1;
        array1[2][3] = 2;
        for (int[] wai:array1
             ) {
            for (int nei:wai
                 ) {
                System.out.print(nei+"\t");
            }
            System.out.println();
        }
        System.out.println("有效值个数");
        int sum =0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
               if (array1[i][j] != 0){
                   sum++;
               }
            }
        }
        //2.创建一个稀疏数组。
        System.out.println("创建稀疏数组");
        int[][] array2 = new int[sum+1][3];
        array2[0][0] = 11;
        array2[0][1] = 11;
        array2[0][2] = sum;
        //遍历二维数组
        int count =0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if (array1[i][j] != 0){
                    count++;
                    array2[count][0] = i;
                    array2[count][1] = j;
                    array2[count][2] = array1[i][j];
                }
            }
        }
        //打印稀疏数组
        for (int i = 0; i < sum+1; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array2[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("=============");
        int[][] array3 = new int[array2[0][0]][array2[0][1]];
        for (int i = 1; i < array2.length; i++) {
            array3[array2[i][0]][array2[i][1]] = array2[i][2];
        }
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                System.out.print(array3[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
