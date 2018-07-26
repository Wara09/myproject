package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        float userInput=sc.nextFloat();



        if (userInput == 7.00) {
            System.out.println("Go to versity bus");

        } else if (userInput > 7.00 && userInput < 8.00) {
            System.out.println("Go to local bus from AK Khan");
        } else if (userInput > 8.00 && userInput < 9.00) {
            System.out.println("Go to local bus from vatiary ");
        }
    }
}
