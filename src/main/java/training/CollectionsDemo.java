package training;

import java.util.*;
import java.util.stream.Stream;

public class CollectionsDemo {

    public static void main(String[] args) {
        //Map<Long, String> employees = Map.of(1L, "John Doe", 2L, "Jane Doe");

        //List<String> names = //Collections.EMPTY_LIST;
        //        Collections.emptyList();
        // Helyettük csak List.of();

        //List<String> names = List.of("John", "Doe");
        //System.out.println(employees);

//        List<Employee> employees = List.of(
//                new Employee("John Doe"),
//                new Employee("Jane Doe"),
//                new Employee("Jack Doe")
//        );
//
//        System.out.println(employees);
//
//        employees.get(0).setName("Jack"); // Módosítható objektum
//        System.out.println(employees);

        Set<Employee> employees = Set.of(
                new Employee("John Doe"),
                new Employee("Jane Doe"),
                new Employee("Jack Doe")

        );

        System.out.println(employees);

        String fruit = null;
        Optional.ofNullable(fruit).stream();

        String name = "john";

        String out = Optional.ofNullable(name)
                .or(() -> Optional.of("anonymous")).get();
        System.out.println(out);

    }
}
