package com.example.demo.service;

import com.example.demo.model.Person;
import java.util.List;
import java.util.stream.Collectors;

public class PersonService {

    public List<String> filterPersons(List<Person> persons) {
        return persons.stream()
                .filter(person -> person.getAge() > 20)
                .filter(person -> !person.getName().toLowerCase().startsWith("a"))
                .map(Person::getName)
                .collect(Collectors.toList());
    }

    public List<String> filterEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(num -> num % 2 == 0) // Filter even numbers
                .map(String::valueOf) // Convert to String
                .collect(Collectors.toList());
    }
}
