package ucankucuk.github.io.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Example java code with Java8
 * .strem()   -> Convert List to Stream
 * .filter()  -> to filter a List
 * .collect() -> Convert Stream into a List
 */
public class AfterJava8Part1 {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("java", "c++", "python", "R", "Ruby");

        System.out.println("Before Filtered");
        strList.forEach(System.out::println);

        List<String> filteredList = strList.stream()
                .filter(str -> !str.equals("java"))
                .collect(Collectors.toList());

        System.out.println("After Filtered");
        filteredList.forEach(System.out::println);


    }
}
