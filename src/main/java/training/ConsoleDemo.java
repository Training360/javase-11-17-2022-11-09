package training;

public class ConsoleDemo {

    public static void main(String[] args) {
        System.out.println(System.console().charset());
        System.out.println(System.getProperty("native.encoding"));
    }
}
