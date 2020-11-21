package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        String line = scan.nextLine();
        String longNum = "", shortNum = line;
        for (String s : line.split(" ")) {
            if (s.length() > longNum.length()) longNum = s;
            if (s.length() < shortNum.length()) shortNum = s;
        }
        System.out.println("Longest number: '" + longNum + "'");
        System.out.println("Length: " + longNum.length());
        System.out.println("Shortest number: '" + shortNum + "'");
        System.out.println("Length: " + shortNum.length());
    }
}
