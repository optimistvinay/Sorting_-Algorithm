package com.sorting;

public class BubleSort {


    public static void main(String[] args) {

        int[] inputData = {34, 11, 526,35, 99};

        int temp;
        for(int i = 0; i < inputData.length; i++){
            boolean change = false;

            for(int j=0; j< inputData.length-1-i; j++){
                if(inputData[j] > inputData[j+1]){
                    temp = inputData[j];
                    inputData[j] = inputData[j+1];
                    inputData[j+1] = temp;
                    change = true;
                }
            }

            if(!change){
                break;
            }
        }

        System.out.println(inputData);
    }
}
