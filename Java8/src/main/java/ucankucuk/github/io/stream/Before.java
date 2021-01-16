package ucankucuk.github.io.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Example java code before Java8
 */
public class Before {

    public static void main(String[] args) {
        List<String> strList = Arrays.asList("java", "c++", "python", "R", "Ruby");
        List<String> filteredList = getFilteredList(strList, "java");
        System.out.println("Before Filtered");
        writeList(strList);
        System.out.println("After Filtered");
        writeList(filteredList);

    }

    public static List<String> getFilteredList(List<String> list, String filter) {
        List<String> result = new ArrayList<>();
        for (String str : list) {
            if (!str.equals(filter)) {
                result.add(str);
            }
        }
        return result;
    }

    public static void writeList(List<String> list) {
        for (String str : list) {
            System.out.println(str);
        }
    }


}
