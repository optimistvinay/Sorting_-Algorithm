package com.sorting;

public class BubleSort_String {

    public static void main(String[] args) {

        String[] inputData = {"AB", "DD", "AWE", "RTY", "ADF"};

        String temp;
        for(int i = 0; i < inputData.length; i++){
            boolean change = false;

            for(int j=0; j< inputData.length-1-i; j++){
                if(inputData[j].compareTo(inputData[j+1]) > 0){
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
