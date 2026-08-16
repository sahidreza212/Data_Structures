package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sum_Of_4 {

    public static ArrayList<ArrayList<Integer>> fourSum(int arr[] , int target){

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int n = arr.length;

        for(int i = 0; i < n; i++){
            for( int j = i+1; j < n ;j++){
                for(int k = j+1; k < n; k++){
                    for( int l = k+1;l < n;l++){
                        if(arr[i] + arr[j] + arr[k] + arr[l] == target){

                            ArrayList<Integer> curr = new ArrayList<>(Arrays.asList(arr[i], arr[j], arr[k] ,arr[l]));

                            // sort  to remove duplicate
                            Collections.sort(curr);

                            //check for uniqueness
                            if(!res.contains(curr)){
                                res.add(curr);
                            }
                        }
                    }
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {

        int arr [] = {10,2,3,4,5,7,8};
        int target = 23;
        ArrayList<ArrayList<Integer>> ans = fourSum(arr,target);

        for(ArrayList<Integer> v : ans){
            for(int x : v){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }

}
