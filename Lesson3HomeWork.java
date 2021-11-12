/**
 * Java 1. HomeWork 3
 *
 @ autor Shchukina Olga
 @ version 12.11.2021
*/

import java.util.Arrays;
import java.util.Random;

class Lesson3HomeWork {
    
    public static void main(String[] args) {
        
        changeZeroToOne(); 
        aHundred();
        multiplicationByTwo();
        fillDiagonal();
        inInputTwoArguments(5, 7);
        inArrayMinMax();
    }
        
    static void changeZeroToOne() {
        int[] arr = { 0, 1, 0, 1, 0, 1, 0, 1, 0, 1 };
            System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1; 
            }
            else { 
                arr[i] = 0; 
            }
        }
            System.out.print(Arrays.toString(arr)); 
            System.out.println();
    }

    static void aHundred() {
        int[] arr1 = new int[100];
        arr1[0] = 0;
        for (int i = 1; i < arr1.length; i++) {
            arr1[i] = i;
            System.out.println(arr1[i]);
        }
    }

    static void multiplicationByTwo() {
        int[] arr2 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
            System.out.println(Arrays.toString(arr2));
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] > 6) {
                arr2[i] *= 2; 
            }
            System.out.print(" " + arr2[i]);
        }
        System.out.println();
    }

    static void fillDiagonal() {
        int[][] arr3 = new int[4][4];
        for (int i = 0; i < arr3.length; i++) {
            System.out.println();
        arr3[i][i] = 1;
        arr3[i][arr3.length - i - 1] = 1;
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(Arrays.toString(arr3[i]));
        }
        System.out.println();
    }

    static int[] inInputTwoArguments (int len, int initialValue){
        int arr4[] = new int[len];
        for (int i = 0; i < arr4.length; i++){
        arr4[i] = initialValue;
            System.out.print(arr4[i]);
        }
        return arr4;
    }

    static int[] inArrayMinMax() {
        int arr5[] = {20, 30, 10, 45};
        int min = arr5[0];
        int max = arr5[0];
        for(int i : arr5){
            if (min > i)
                min = i;
            if (max < i)
                max = i;
        }
        return new int[]{min, max};
    }
}