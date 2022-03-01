package com.sorting;

public class InsertionSort {

    public static void main(String[] args) {
        int[] inputData = {122, 34, 11, 526,35, 99};
        int temp, j;
        for(int i=1; i < inputData.length; i++){
            j = i;
            temp= inputData[i];
            while(j>0 && inputData[j-1] > temp){
                inputData[j] = inputData[j-1];
                j=j-1;
            }
            inputData[j]=temp;

        }

        System.out.println(inputData);
    }
}
