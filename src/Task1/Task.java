package Task1;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.StreamHandler;

public class Task {
    public static void stoyear(){
        Scanner scanner = new Scanner(System.in);
        String i = scanner.nextLine();
        LocalDate parse = LocalDate.parse(i,DateTimeFormatter.ofPattern("dd.MM.yyyy")).plusYears(100);
        System.out.println(parse);
    }


}
