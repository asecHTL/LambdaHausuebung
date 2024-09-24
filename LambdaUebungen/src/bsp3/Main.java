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

        NumberTest palindromeTester = (number -> {
            char[] chars = String.valueOf(number).toCharArray();
            char[] charsCoppy = new char[chars.length];
            for (int i = chars.length - 1; i >= 0; i--) {
                charsCoppy = Character.toChars(i);
            }
            for (int j = 0; j < chars.length; j++) {
                int x = chars[j];
                int y = charsCoppy[j];
                if (x != y) {
                    return false;
                }
            }
            return true;
        });

        NumberTester numberTester = new NumberTester("testFile_bsp3.txt");
        numberTester.setOddEvenTester(oddEvenTester);
        numberTester.setPrimeTester(primeTester);
        numberTester.setPalindromeTester(palindromeTester);
        numberTester.testFile();
    }
}
