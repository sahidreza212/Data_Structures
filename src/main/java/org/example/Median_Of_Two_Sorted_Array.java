package org.example;

import java.util.Arrays;

public class Median_Of_Two_Sorted_Array {

    public static double medianOf2(int [] a, int[] b){

        int [] c = new int[a.length + b.length];

        System.arraycopy(a,0,c,0,a.length);
        System.arraycopy(b,0,c,a.length,b.length);

        Arrays.sort(c);
        int len = c.length;

        if(len % 2 == 0){
            return c[len/2]+c[len/2-1];
        }else {
            return c[len/2];
        }

    }
    public static void main(String[] args) {

        int []a = {-5,3,6,12,15};
        int []b = {-12,-10,-6,-3,4,10};
        System.out.println(medianOf2(a,b));

    }
}
