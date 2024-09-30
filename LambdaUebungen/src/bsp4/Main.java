package bsp4;

import bsp3.NumberTest;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CalculateOperation add = (number1,number2) ->  {
            double a = number1.getA();
            double b = number2.getB();

        };

    }



    public void testFile() throws IOException {
        Scanner scanner = new Scanner(System.in);
        int testCases;
        int testCaseNeeded;
        int testNummber;
        int input = 0;

       do {
           System.out.println("Choose Calculator: ");
           System.out.println("1 - Relational Calculator");
           System.out.println("4 - Exit Program");

           input = Integer.parseInt(scanner.nextLine());
        }while (input != 4);
        do {
            System.out.println("Choose Calculator: ");
            System.out.println("1 - Relational Calculator");
            System.out.println("4 - Exit Program");

            input = Integer.parseInt(scanner.nextLine());
        }while (input != 4);

    }
}
