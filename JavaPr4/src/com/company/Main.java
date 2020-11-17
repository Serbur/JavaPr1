package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sum = 0, comp = 1, inputNum;
        int counter;
        Scanner NumScanner = new Scanner(System.in);

        System.out.print("Enter the total number for calculations: ");

        counter = NumScanner.nextInt();

        System.out.println("Please enter " + counter + " numbers: ");

        for(int x = 1; x<=counter ;x++){
            inputNum = NumScanner.nextInt();
            sum = sum + inputNum;
            comp = comp * inputNum;
        }
        System.out.println("The summa is " + sum + " and composition is " + comp);
    }
}
