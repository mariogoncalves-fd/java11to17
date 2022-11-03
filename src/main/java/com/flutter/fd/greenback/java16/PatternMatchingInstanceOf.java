package com.flutter.fd.greenback.java16;

import com.flutter.fd.greenback.Person;

public class PatternMatchingInstanceOf {

    public static void main(String[] args) {
        Object o = new Person("John", 21);
        oldStyle(o);
    }


    private static void oldStyle(final Object o) {
        if (o instanceof Person) {
            Person person = (Person) o;
            System.out.println("This person name is " + person.name());
        }
    }

    private static void patternMatching(Object o) {
        if (o instanceof Person person) {
            System.out.println("This person name is " + person.name());
        }
    }

    private static void patternMatchingScope(Object o) {
        if (o instanceof Person person && person.age() > 18) {
            System.out.println("This person name is " + person.name());
        }
    }

    private static void patternMatchingScopeException() {
        Object o = new Person("John", 21);
        if (!(o instanceof Person person)) {
            throw new RuntimeException();
        }
        System.out.println("This person name is " + person.name());
    }

}
