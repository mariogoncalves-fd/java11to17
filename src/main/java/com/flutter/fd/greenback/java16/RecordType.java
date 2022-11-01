package com.flutter.fd.greenback.java16;

import java.util.Objects;

public class RecordType {

    class OldPerson {
        final String name;
        final int age;

        OldPerson(final String name, final int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            final OldPerson oldPerson = (OldPerson) o;
            return age == oldPerson.age && Objects.equals(name, oldPerson.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

        @Override
        public String toString() {
            return "OldPerson{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    record Person (String name, int age) {}

    record AdultPerson (String name, int age) {
        AdultPerson {
            if (age<18) throw new IllegalArgumentException("For an adult, age must bet euql or greater than '18'");
        }
    }
}
