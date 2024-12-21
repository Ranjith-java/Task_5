package Task_5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Datediff {
    public static void main(String[] args) {
        LocalDate l1=LocalDate.now();  // it gives current date
        LocalDate l2=LocalDate.of(1990,05,13);   //specified date
        System.out.println("Year "+ChronoUnit.YEARS.between(l2,l1)+" "+"Month "+ChronoUnit.MONTHS.between(l2,l1)+" "+"Days "+ChronoUnit.DAYS.between(l2,l1));
    }


}
