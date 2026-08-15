package org.example;

import java.util.Arrays;

public class Reversing_SubArray_And_Make_Sorted {

    public static boolean checkReverse(int arr[] , int n){

        int [] temp = new int[n];
        for(int i = 0;i<n; i++){
            temp[i] = arr[i];
        }

        Arrays.sort(temp);

        // finding the first mismatch
        int front;
        for(front = 0;front < n ; front++){
            if(temp[front] != arr[front]){
                break;
            }
        }

        // finding the last mismatch
        int back;
        for(back = n-1; back>=0;back--){
            if(temp[back] != arr[back]){
                break;
            }
        }

        // if the whole array is sorted
        if(front >= back){
            return true;
        }

        // checking the array is decreasing or not

        while (front < back){
            if(arr[front] <= arr[front+1]){
                return false;
            }
            front++;
        }
        return true;
    }
    public static void main(String[] args) {

        int arr [] = {1,2,4,5,3};
        int n = arr.length;

        if(checkReverse(arr,n)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
