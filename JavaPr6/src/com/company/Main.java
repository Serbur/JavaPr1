package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter amount of numbers: ");
        Scanner scan = new Scanner(System.in);
        int in = scan.nextInt();
        System.out.print("Enter numbers: ");
        int aryNums[] = new int[in];
        for(int j=0; j < in; j++) {
            aryNums[j] = scan.nextInt();
            }
        Arrays.sort(aryNums);

        for(int i=0; i < aryNums.length; i++) {
            if (aryNums[i]>=0)
                System.out.println("num:" + aryNums[i]);
            else {
                System.out.println("Input Error");
                break;
            }
        }
    }}