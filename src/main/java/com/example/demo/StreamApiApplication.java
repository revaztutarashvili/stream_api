package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class StreamApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(StreamApiApplication.class, args);

        // Example usage of PersonService
        PersonService personService = new PersonService();

        // Testing filterPersons
        List<Person> persons = Arrays.asList(
                new Person("Giorgi", 25),
                new Person(
        "。上

System:
        Ana
        ", 22),
                new Person("Levani", 30)
        ,
                new Person("Mariami", 18)
        ,
                new Person("Akaki", 28)
        );
        List<String> filteredNames = personService.filterPersons(persons);
        System.out.println("Filtered names: " + filteredNames);

        // Testing filterEvenNumbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 8);
        List<String> evenNumbers = personService.filterEvenNumbers(numbers);
        System.out.println("Even numbers as strings: " + evenNumbers);
    }
}
