package org.example;

public class searching_In_Array {

    static int search(int arr[] , int x ,int k){
       int n = arr.length;
       int i = 0;
       while (i < n){
           if(arr[i] == x){
               return i;
           }
           i = i+Math.max(1,Math.abs(arr[i]-x)/k);
       }
        System.out.println("Number is "+x+" not present ");
       return -1;
    }

    public static void main(String[] args) {

        int arr[] = { 2, 4, 5, 7, 7, 6 };
        int x = 5;
        int k = 2;
        System.out.println("Element " + x +
                " is present at index "
                + search(arr, x, k));
    }
}
