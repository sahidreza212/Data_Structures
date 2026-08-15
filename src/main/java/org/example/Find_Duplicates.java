package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Find_Duplicates {

    public static List<Integer> findDuplicates(int arr[]){

        int n = arr.length;
        Map<Integer , Integer> freqMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i<n ; i++){
            freqMap.put(arr[i],
                    freqMap.getOrDefault(arr[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : freqMap.entrySet()){
            if(entry.getValue()>1){
                result.add(entry.getKey());
            }
        }

        if(result.isEmpty()){
            result.add(-1);
        }
        return result;

    }
    public static void main(String[] args) {

        int arr[] = { 1,6,5,2,3,3,2};
        List<Integer> duplicates = findDuplicates(arr);

        for(int element : duplicates){
            System.out.print(element+" ");
        }

    }

}
