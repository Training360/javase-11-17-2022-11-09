package training;

import java.text.NumberFormat;
import java.util.Locale;

public class InternationalizationDemo {

    public static void main(String[] args) {
        NumberFormat fmt = NumberFormat.getCompactNumberInstance(new Locale("hu", "HU"), NumberFormat.Style.LONG);
        System.out.println(fmt.format(1000));
        System.out.println(fmt.format(100000));
        System.out.println(fmt.format(1000000));

    }
}
