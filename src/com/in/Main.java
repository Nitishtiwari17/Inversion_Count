package com.in;

public class Main {

    public static void main(String[] args) {
        int array[]={1, 9, 6, 4, 5};
        int count=0;
        for(int i=0;i<array.length;i++ ){
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
