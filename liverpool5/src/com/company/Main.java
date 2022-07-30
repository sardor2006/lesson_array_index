package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        int[] array = {6, 25, 91, 23, 72, 9, 18, 6,11,25,874,889,77,4,4,7};
        int n = 13;

        if (n < 0 || n >= array.length) {
            System.out.println(0);
        } else {
            System.out.println(array[n]);
        }


    }
}
