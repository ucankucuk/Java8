package ucankucuk.github.io.stream;

import ucankucuk.github.io.stream.model.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Example java code before Java8
 */
public class BeforeJava8Part2 {

    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("ali", 25),
                new Person("ahmet", 26),
                new Person("mehmet", 27),
                new Person("veli", 28));

        Person searchedPerson = getPersonByName(personList, "ahmet");
        System.out.println("Find Person : Name = " + searchedPerson.getName() + " Age = " + searchedPerson.getAge());


    }

    private static Person getPersonByName(List<Person> personList, String name) {
        Person findPerson = null;
        for (Person person : personList) {
            if (name.equals(person.getName())) {
                findPerson = person;
            }
        }
        return findPerson;
    }

}
