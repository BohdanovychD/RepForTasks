package homework.lesson_4.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayListSort {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<Integer>();
        for (int i = 1; i < 15; i++) {
            integers.add(739 % i);
        }
        Map<Object, Long> integerIntegerMap = integers.stream()
                .collect(Collectors.groupingBy(e -> e.toString(), Collectors.counting()));
        System.out.println(integerIntegerMap);
    }
}
