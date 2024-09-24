package bsp3;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {



        NumberTest oddEvenTester = (number -> number % 2 == 0);

        NumberTest primeTester = (number -> {
            if (number <= 2) {
                return (number == 2);
            }
            for (long i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return false;
        }
        );

        NumberTest palindromeTester = (line -> {

            return false;
        });

        NumberTester numberTester = new NumberTester("testFile_bsp3.txt");
        numberTester.setOddEvenTester(oddEvenTester);
        numberTester.setPrimeTester(primeTester);
        numberTester.setPalindromeTester(palindromeTester);
        numberTester.testFile();
    }
}
