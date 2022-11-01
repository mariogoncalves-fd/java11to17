package com.flutter.fd.greenback.java14;

import com.flutter.fd.greenback.Person;

import java.util.HashMap;

public class NewNull {

    public static void main(String[] args) {
        HashMap<String, Person> people = new HashMap<>();
        people.put("person1", new Person("John", 21));
        people.put("person2", new Person("Jane", 17));
        people.put("person3", null);
        var color = people.get("person3").name();
    }


}
