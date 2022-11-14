package training;

public class PatternMatchingDemo {

    public void readName(Object object) {
        if (object instanceof Employee employee) {
            System.out.println(employee.name());
        }
    }

    public static void main(String[] args) {
        Object object = new Employee("John Doe");
        new PatternMatchingDemo().readName(object);

    }
}
