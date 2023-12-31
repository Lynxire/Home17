package Task4;

import java.util.function.Consumer;
import java.util.function.Function;

public class Task4 {
    public static void Con(String BYN){
        Consumer<String> consumer = x ->{
            String[] strings = x.split(" ");

            double doubles = Double.parseDouble(strings[0]);
            double kyrc = 2.1;
            double result = doubles / kyrc;
            System.out.println(strings[0] + " " + strings[1] + " в долларах: "+ result + " USD");
        };

        consumer.accept(BYN);


    }
}
