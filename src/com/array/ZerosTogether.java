package com.array;

import java.util.Arrays;

public class ZerosTogether {

    public static void main(String[] args) {
        //int arr []={22,0,3,0,12,34,0,0,0,71,66,0};
        int arr []={0,22,0,3,0};
        //int arr []={22,0,3};
        int   cnt =0, x=0,j=0;
        for(int i=0;i<arr.length;i++){
       if(arr[i]!=0){
           x=arr[i];
           j=i-cnt;
          arr[j]=x;
          if (cnt>0)
              arr[i]=0;
         }else{
       cnt++;
      }
    }
        Arrays.stream(arr).forEach(o-> System.out.print(o+" , "));
    }
}
