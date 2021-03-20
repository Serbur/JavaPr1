package example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter: ");
        String str = sc.nextLine();
        Pattern pattern = Pattern.compile("[a-z0-9\\[|\\]$]+");
        Matcher matcher = pattern.matcher(str);
        boolean found = matcher.matches();
        if(found)
        {
            String[] subStr = str.split("[\\W]");
            for (int i=0 ; i<subStr.length ; i++) {
                if (subStr[i].matches("[0-9]+")) {
                    int num = Integer.parseInt(subStr[i]);
                    int counter = 0;
                    while (counter < num){
                        System.out.print(subStr[i+1]);
                        counter ++;
                    }}
            }
        }
        else{
            System.out.println("Incorrect input");
        }
    }
}
