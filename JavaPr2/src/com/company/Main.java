package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter text: ");
        String str = in.nextLine();
        String reverse = new StringBuffer(str).reverse().toString();
        System.out.println("Reverse text: " + reverse);
    }
}