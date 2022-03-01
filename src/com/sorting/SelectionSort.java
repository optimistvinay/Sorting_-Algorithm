package com.sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int[] inputData = {122, 34, 11, 526,35, 99};

        int temp =0;
        for(int i=0;i< inputData.length; i++){
            int min = i;
            for(int j =i+1; j < inputData.length; j++){
                if(inputData[min] > inputData[j]){
                    min=j;
                }
            }

            temp = inputData[i];
            inputData[i] = inputData[min];
            inputData[min] = temp;
        }

        System.out.println(inputData);
    }
}
