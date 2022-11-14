package training;

import java.util.*;

public class InterfaceMethodsDemo {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Statikus interfész metódus
        List<String> names = List.of("John", "Jack");
        //names.add("Joe"); // UnsupportedOperationException
        //names.set(0, "Jane"); // UnsupportedOperationException

        // Java 9 előtt
        // Util antipattern
        List<String> fruits = Arrays.asList("raspberry", "orange");
        //fruits.add("banana"); // UnsupportedOperationException
        fruits.set(0, "banana");
        System.out.println(fruits);

        List<String> trees = new ArrayList<>(List.of("tölgy", "dió", "cseresznye"));
        trees.sort(Comparator.naturalOrder());

        // Java 8 előtt, util osztály:
        // Collections.sort(trees);
    }
}