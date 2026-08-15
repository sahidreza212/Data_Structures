package org.example;

import java.util.Arrays;

public class Minimum_Cost {

    public static int minCost(int arr[]){
        Arrays.sort(arr);
        int median = arr[arr.length / 2];
        int cost = 0;
        for(int x : arr){

            cost += Math.abs(x-median);
        }
        return cost;
    }
    public static void main(String[] args) {

        int arr[] = {1,100,101};
    }
}
