package bsp4;

import bsp3.NumberTest;

import java.io.*;
import java.util.Scanner;


public class Main {
    static RationalCalculator rationalCalculator;
    public static void main(String[] args) {
        rationalCalculator =   RationalCalculator();
    }

    public int calcMenue(){
        Scanner scanner = new Scanner(System.in);
        int input = 0;



        System.out.println("\n................................................................................................");
        System.out.println("Choose Operation: ");
        System.out.println("1 - Add");
        System.out.println("2 - Substract");
        System.out.println("3 - Multiply");
        System.out.println("4 - Divide");
        System.out.println("6 - Enter Numbers Again");
        System.out.println("> ");

        input = Integer.parseInt(scanner.nextLine());
        return input;
    }

    public void choooseCalculator() throws IOException {
        Scanner scanner = new Scanner(System.in);
        int inputCalculator = 0;



           System.out.println("\n................................................................................................");
           System.out.println("Choose Calculator: ");
           System.out.println("1 - Relational Calculator");
           System.out.println("4 - Exit Program");
           System.out.println("> ");

           inputCalculator = Integer.parseInt(scanner.nextLine());


    }



    public static RationalCalculator RationalCalculator(){
        CalculateOperation add = (a,b) ->{
            return new Number(a.getA() + b.getA() , a.getB() + b.getB());

        };
        CalculateOperation sub = (a,b) ->{
            return new Number(a.getA() - b.getA() , a.getB() - b.getB());

        };
        CalculateOperation multiply = (a,b) ->{
            return new Number(a.getA() * b.getA() , a.getB() * b.getB());

        };
        CalculateOperation divide = (a,b) ->{
            return new Number(a.getA() / b.getA() , a.getB() / b.getB());

        };

        return new RationalCalculator(add,sub,multiply,divide);

    }


    public void rationCalc() throws IOException {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("\n Enter number x a>");
            int inputXA = Integer.parseInt(scanner.nextLine());

            System.out.println("\n Enter number x b>");
            int inputXB = Integer.parseInt(scanner.nextLine());

            System.out.println("\n Enter number y a>");
            int inputYA = Integer.parseInt(scanner.nextLine());

            System.out.println("\n Enter number y b>");
            int inputYB = Integer.parseInt(scanner.nextLine());

            int input = calcMenue();
            try {
                switch (input){
                    case 1: //Add
                        
                    case 2: //Sub+
                    case 3: //Mult
                    case 4: //Divide
                    default: calcMenue();
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }

        }catch (NumberFormatException e){
            System.out.println("\n Error");
        }



    }
}
