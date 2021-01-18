package ucankucuk.github.io.stream;

import ucankucuk.github.io.stream.model.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

/**
 * Example .map() method - Java8
 */
public class AfterJava8Part3 {

    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("ali", 25),
                new Person("ahmet", 26),
                new Person("mehmet", 27),
                new Person("veli", 28));

        String name = personList.stream()
                .filter(x -> 25 == x.getAge())
                .map(Person::getName)
                .findAny()
                .orElse("");

        System.out.println("Age 25 Name : " + name);

        List<String> nameList = personList.stream()
                .map(Person::getName)
                .filter(personName -> personName.contains("a"))
                .collect(Collectors.toList());

        System.out.println("Persons's name contains 'a' ");
        nameList.forEach(System.out::println);

        List<String> nameListWithLimit = personList.stream()
                .map(Person::getName)
                .filter(personName -> personName.contains("a"))
                .limit(1)
                .collect(Collectors.toList());

        System.out.println("Persons's name contains 'a' With Limit");
        nameListWithLimit.forEach(System.out::println);

        List<Person> nameUpperCasePerson = personList.stream()
                .map(person -> {
                    person.setName(person.getName().toUpperCase(Locale.ROOT));
                    return person;
                }).collect(Collectors.toList());

        nameUpperCasePerson.forEach(System.out::println);

        //personList.forEach(person -> person.setName(person.getName().toUpperCase(Locale.ROOT)));
        //personList.forEach(System.out::println);

    }
}
