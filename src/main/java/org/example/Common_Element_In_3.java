package org.example;

import java.util.ArrayList;
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
    }

    public static void main(String[] args) {

        int[] a = {1, 5, 10, 20, 30};
        int[] b = {5, 13, 15, 20};
        int[] c = {5, 20};

    }
}
