package com.yangjie.array;

import java.util.Arrays;

public class ArrayDemo5 {
    public static void main(String[] args) {
        /*
            [3][2]
            1,2  arrays[0][0] arrays[0][1]
            3,4  arrays[1][0] arrays[1][1]
            5,6  arrays[2][0] arrays[2][1]
            7,8  arrays[3][0] arrays[3][1]
         */
        int[][] a = {{1,2},{3,4},{5,6},{7,8}};
        System.out.println(Arrays.toString(a[0]));
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+"\t") ;
            }
             System.out.println("\n");
        }
    }
}
