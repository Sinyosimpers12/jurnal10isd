package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner input = new Scanner(System.in);

        int panjangData = input.nextInt();

        int[] data = new int[panjangData];

        for(int i = 0; i < panjangData; i++){
            data[i] = input.nextInt();
        }

        HeapSorter heapSorter = new HeapSorter(data);

        heapSorter.sort();

        System.out.println(Arrays.toString(data));
    }
}
