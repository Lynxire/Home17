package Task3;

import java.util.function.Function;

public class Task3 {
    public static void func(String BYN){
        Function<String,Double> function = x ->{
            String[] strings = x.split(" ");
            double d = Double.parseDouble(strings[0]);
            String string = strings[1];
            double kyrc = 2.1;
            return d / kyrc;
        };




        System.out.println(BYN + " в долларах: " + function.apply(BYN) + " USD");
    }
}
