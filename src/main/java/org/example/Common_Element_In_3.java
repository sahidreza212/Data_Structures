package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Common_Element_In_3 {

    public static ArrayList<Integer>commonElement(int[] a,int[] b,int[] c){
        Map<Integer , Integer>count = new HashMap<>();

        // process arr 1
        for(int i = 0; i<a.length;i++){
            if(i == 0 || a[i] != a[i-1]){
                count.put(a[i],1);
            }
        }

        // process arr 2
        for(int i = 0; i<b.length;i++){
            if(i == 0 || b[i] != b[i-1]){
                if(count.getOrDefault(b[i],0)==1);
                count.put(b[i],2);
            }
        }

        // process array 3
        for(int i = 0; i<c.length;i++){
            if(i == 0 || c[i] != c[i-1]){
                if(count.getOrDefault(c[i],0)==2);
                count.put(c[i],3);
            }
        }
        // Collect the common element
        ArrayList<Integer> common = new ArrayList<>();
        for(Map.Entry<Integer, Integer>entry : count.entrySet()){
            if(entry.getValue()==3){
                common.add(entry.getValue());
            }
        }

        // Sorting element
        Collections.sort(common);
        return common;
    }

    public static void main(String[] args) {

        int[] a = {1, 5, 10, 20, 30};
        int[] b = {5, 13, 15, 20};
        int[] c = {5, 20};

    }
}
