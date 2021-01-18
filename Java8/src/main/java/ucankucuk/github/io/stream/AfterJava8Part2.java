package ucankucuk.github.io.stream;

import ucankucuk.github.io.stream.model.Person;

import java.util.Arrays;
import java.util.List;

public class AfterJava8Part2 {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("ali", 25),
                new Person("ahmet", 26),
                new Person("mehmet", 27),
                new Person("veli", 28));

        Person searchedPerson1 = personList.stream()
                .filter(x -> "ali".equals(x.getName()))
                .findAny()
                .orElse(null);
        System.out.println("searchedPerson1 : " + searchedPerson1.toString());

        Person searchedPerson2 = personList.stream()
                .filter(x -> "xxxx".equals(x.getName()))
                .findAny()
                .orElse(null);
        System.out.println("searchedPerson2 : " + searchedPerson2);

        // Multiple Condition-1

        Person searchedPerson3 = personList.stream()
                .filter(x -> "ali".equals(x.getName()) && 25 == x.getAge())
                .findAny()
                .orElse(null);
        System.out.println("searchedPerson3 : " + searchedPerson3.toString());

        // Multiple Condition-2
        Person searchedPerson4 = personList.stream()
                .filter(x -> "ali".equals(x.getName()))
                .filter(x -> 25 == x.getAge())
                .findAny()
                .orElse(null);
        System.out.println("searchedPerson4 : " + searchedPerson4.toString());

        // Multiple Condition-3
        Person searchedPerson5 = personList.stream()
                .filter(x -> {
                    if ("mehmet".equals(x.getName()) && 27 == x.getAge()) {
                        return true;
                    }
                    return false;
                }).findAny()
                .orElse(null);
        System.out.println("searchedPerson5 : " + searchedPerson5.toString());

    }
}
