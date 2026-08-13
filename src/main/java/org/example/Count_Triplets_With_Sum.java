package org.example;

public class Count_Triplets_With_Sum {
    public static int countTriplets(int arr[] , int sum){
        int n = arr.length;
        int ans = 0;

        for(int i = 0;i<n-2;i++){
            for(int j = i+1;j<n-1;j++){
                for(int k = j+1;k<n;k++){

                    if((arr[i]+arr[j]+arr[k]) < sum){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {-2,0,1,3};
        int sum = 2;
        System.out.println(countTriplets(arr,sum));
    }
}
