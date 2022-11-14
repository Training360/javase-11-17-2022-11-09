package training;

import java.util.Optional;

public class ConditionsDemo {

    public static void main(String[] args) {
        // Kerüljük a negáció használatát!
        var maybeName = Optional.of("John Doe");
        if (maybeName.isEmpty()) {
            System.out.println("anonymous");
        }
    }
}
