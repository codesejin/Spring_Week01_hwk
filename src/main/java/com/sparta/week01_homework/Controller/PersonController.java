package com.sparta.week01_homework.Controller;

import com.sparta.week01_homework.models.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PersonController {

    @GetMapping("/person")
    public Person getPerson() {
        Person person = new Person();
        person.setName("박세진");
        person.seAge(3);
        person.setAddress("일산");
        person.setJob("개발자");
        return person;
    }
}
