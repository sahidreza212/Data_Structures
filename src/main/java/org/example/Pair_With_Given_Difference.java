package org.example;

public class Pair_With_Given_Difference {
    public static boolean findPair(int arr[] , int x){

        int n = arr.length;
        for (int i = 0; i<n;i++){
            for(int j = 0;j<n;j++){

                // find the absolute difference match
                if(Math.abs(arr[i] - arr[j]) == x){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int arr[] = {5,20,3,2,50,80};
        int x = 78;

    }
}
