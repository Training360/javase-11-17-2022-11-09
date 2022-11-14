package training;

public class TextBlockDemo {

    public static void main(String[] args) {
        String sql = """
                select
                  from employees
                where
                  age > 120
                """;

        String json = """
                {
                    "name": "John Doe"
                }
                """;

        System.out.println(json);
    }
}
