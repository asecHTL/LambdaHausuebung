package bsp3;

import java.io.*;

public class NumberTester {
    NumberTest primeTester;
    NumberTest palindromeTester;
    NumberTest oddTester;
    String filename;

    public NumberTester(String fileName) {
        filename = fileName;
    }



    public void setOddEvenTester(NumberTest oddTester){
        this.oddTester = oddTester;
    }

    public void  setPrimeTester(NumberTest primeTester){
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTest palindromeTester){
        this.palindromeTester = palindromeTester;
    }

    public void testFile() throws IOException {
        int testCases;
        int testCaseNeeded;
        int testNummber;
        File file = new File(filename);
        Reader reader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line = bufferedReader.readLine();
        testCases = Integer.parseInt(line);
        while (line != null) {
            line = bufferedReader.readLine();
            String[] lineArray = line.split("  ");
            testCaseNeeded = Integer.parseInt(lineArray[0]);
            testNummber = Integer.parseInt(lineArray[1]);
            switch (testCaseNeeded) {
                case 1: boolean tempOddEven = oddTester.testNumber(testNummber);
                if (tempOddEven){
                    System.out.println("EVEN");
                }else{
                    System.out.println("ODD");
                }
                break;
                case 2: boolean tempPrime = primeTester.testNumber(testNummber);
                    if (tempPrime){
                        System.out.println("PRIME");
                    }else{
                        System.out.println("NO PRIME");
                    }
                break;
                case 3: palindromeTester.testNumber(testNummber);
                    boolean tempPalindrome = primeTester.testNumber(testNummber);
                    if (tempPalindrome){
                        System.out.println("PALINDROME");
                    }else{
                        System.out.println("NO PALINDROME");
                    }
                break;
                    default:
                        System.out.println("Case not defined!");
            }
        }
    }



}
