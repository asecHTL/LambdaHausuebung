package bsp3;

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

    public void testFile(){

    }



}
