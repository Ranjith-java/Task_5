package Task_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Emptyornot {
    public static void main(String[] args) {
eon();
    }
    public static void eon(){
        List<String> list1= Arrays.asList("abc","","bc","efg","abed","","jkl");
        List<String> list2=list1.stream()
                .filter(s->!s.isEmpty()) // filter check for non empty string
                        .collect(Collectors.toList());
        System.out.println(list2);
    }

}
