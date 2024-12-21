package Task_5;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Touppercase {
    public static void main(String[] args) {
        changecase();

    }
    public static void changecase()  {
        List<String> list1 = Arrays.asList("java", "guvi", "python");
            List<String> list2= list1.stream()
                            .map(String::toUpperCase) // map method used for uppercase
                                    .collect(Collectors.toList());
        System.out.println(list2);
    }
}
