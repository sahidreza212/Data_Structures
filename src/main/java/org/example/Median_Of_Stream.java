package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Median_Of_Stream {

    public static ArrayList<Double> getMedian(int arr[]){

        ArrayList<Double>res = new ArrayList<>();
        int n = arr.length;
        res.add((double)arr[0]);

        for(int i = 1; i < n ; i++) {
            int k[] = Arrays.copyOf(arr,i+1);
            Arrays.sort(k);

            int len = k.length;

            if (len % 2 == 0) {
                double median = (k[len / 2] + k[len / 2 - 1]) / 2.0;
                res.add(median);
            } else {
                double median = k[len / 2];
                res.add(median);
            }
        }

        return res;

    }
    public static void main(String[] args) {
        int arr [] = {2, 2, 2, 2};
        System.out.println(getMedian(arr));


    }
}
