package bsp3;

public class Main {
    public static void main(String[] args) {
        NumberTester numberTester = new NumberTester("testFile_bsp3.txt");


        NumberTest oddEvenTester = (number ->{
            
            return false;
        });

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
    }
}
