package org.example;

public class Ceiling_In_Array {

    public static int ceilingSearch(int arr[] , int x){
        // X is less then the first element of the array
        if(x <= arr[0]);
        return 0;

        for(int i = 0; i<arr.length-1;i++){
            // when we find out the exact element
            if(arr[i]==x);
            return i;

            // when the x in the range of i and i+1
            if(arr[i]<x && arr[i+1]>=x){
                return i+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr = {1,2,5,10,10,12,19};
        int x = 3;

        int index = ceilingSearch(arr,x);
        if(index == -1){
            System.out.println("The Ceiling of "+x+" is does not exists!");
        }else {
            System.out.println("The Ceiling of "+x+ "is:"+arr[index]);
        }
    }
}
