package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter amount of numbers: ");
        int num = in.nextInt();
        System.out.print("Enter range a: ");
        int a = in.nextInt();
        System.out.print("Enter range b: ");
        int b = in.nextInt();
        for (int i = 0; i < num; i++) {
            int nums = a + (int) (Math.random() * ((b - a) + 1));
            System.out.println("\n Number: " + nums);
        }
}}