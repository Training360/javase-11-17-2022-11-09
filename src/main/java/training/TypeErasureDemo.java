package training;

import java.util.ArrayList;
import java.util.List;

public class TypeErasureDemo {

    public static void main(String[] args) {
        //List<String> names = new ArrayList<>();
        //names.add("John Doe");
        //String name = names.get(0);

        //List names = new ArrayList();
        //names.add("John Doe");
        //String name = (String) names.get(0);

        List<String> names = new ArrayList<>();

        // Generikus típus nélküli típus: raw type
        ((List) names).add(12);

        System.out.println((String) names.get(0));
    }
}
