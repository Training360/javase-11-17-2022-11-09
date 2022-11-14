package training;

import java.util.Scanner;

public class BeforeTryWithResourcesDemo {

    public static void main(String[] args) {
        Scanner scanner =
                new Scanner(InterfaceMethodsDemo.class.getResourceAsStream("employees.txt"));
        try (scanner) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }
    }
}
