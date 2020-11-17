package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner MonScanner = new Scanner(System.in);
        System.out.print("Enter the number of month: ");
        int counter = MonScanner.nextInt();
        switch (counter) {
            case 1 -> System.out.println("This month is January ");
            case 2 -> System.out.println("This month is February ");
            case 3 -> System.out.println("This month is March ");
            case 4 -> System.out.println("This month is April ");
            case 5 -> System.out.println("This month is May ");
            case 6 -> System.out.println("This month is June ");
            case 7 -> System.out.println("This month is July ");
            case 8 -> System.out.println("This month is August ");
            case 9 -> System.out.println("This month is September ");
            case 10 -> System.out.println("This month is October ");
            case 11 -> System.out.println("This month is November ");
            case 12 -> System.out.println("This month is December ");
            default -> throw new IllegalStateException("Unexpected value: " + counter);
        }
        }}
