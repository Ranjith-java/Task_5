package Task_5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class gift {
    public static void main(String[] args) {
getgift();
    }
    public static void getgift(){
        // given input of 10 student
        List<String> list1= Arrays.asList("abdul","arun","aravind","bala","Chinna","desoza","kathir","selvan","ram","Zakir");
        List<String> list2=list1.stream()
                .filter(s -> s.startsWith("a")) // filtering the students with starting letter 'a'
                .collect(Collectors.toList());
        System.out.println(list2);
    }
}
