package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String line = String.valueOf(num);
        String longWord = "", shortWord = line;
            for (String s : line.split(" ")) {
                if (s.length() > longWord.length()) longWord = s;
                if (s.length() < shortWord.length()) shortWord = s;
            }

            System.out.println("Самое длинное слово: '" + longWord + "'");
            System.out.println("Длина: " + longWord.length());
            System.out.println("Самое короткое слово: '" + shortWord + "'");
            System.out.println("Длина: " + shortWord.length());

        }
    }