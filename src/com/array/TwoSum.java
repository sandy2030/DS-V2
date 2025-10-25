package com.array;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int a[]={2, 5, 0, -1, 8, 9, -2};
        int target=7;
        HashMap<Integer,Integer> map=new HashMap<>();
        int value1,value2=0;
        for(int i=0;i<a.length;i++) {
            if (map.containsKey(target - a[i]) == false)
                map.put(a[i], i);
            else {
                value1 = map.get(target - a[i]) ;// 0
                value2 = i ;// 1
                System.out.print("("+value1+" , "+value2+") ,");
            }
        }
        System.out.println();
    }
}
