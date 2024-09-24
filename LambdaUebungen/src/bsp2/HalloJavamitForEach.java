package bsp2;

import java.util.ArrayList;
import java.util.List;

public class HalloJavamitForEach {
    public static void main(String[] args) {

        List<String>list = new ArrayList<String>();
        System.out.println("Normale Ausgabe");
        System.out.println();
        list.add("test01");
        list.add("test02");

        System.out.println("for-each Ausgabe");
        System.out.println();
        for (String temp : list){
            System.out.println(temp);
        }

        System.out.println("Lambda Ausgabe 01");
        System.out.println();
        list.forEach(System.out::println);

        System.out.println("Lambda Ausgabe 02");
        System.out.println();
        list.forEach((String s) -> System.out.println(s));

    }


}
