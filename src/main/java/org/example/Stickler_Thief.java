package org.example;

public class Stickler_Thief {

    public static int maxLootRec(int arr[] , int n){
        if(n<=0){
            return 0;
        }
        if(n==0){
            return arr[0];
        }
        int pick = arr[n-1]+maxLootRec(arr,n-2);
        int notPick = maxLootRec(arr,n-1);

        return Math.max(pick,notPick);
    }

    public static int findMaxSum(int [] arr){
        int n = arr.length;
        return maxLootRec(arr,n);
    }
    public static void main(String[] args) {
        int [] arr = {6,5,5,7,4};
        System.out.println(findMaxSum(arr));
    }
}
