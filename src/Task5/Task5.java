package Task5;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Task5 {
    public static void Sup(String BYN){
        Supplier<String> supplier = () ->{
            StringBuilder stringBuilder = new StringBuilder(BYN);
            stringBuilder.reverse();
            String s = stringBuilder + "";
            return s;
        };

        System.out.println(supplier.get());

    }
}
