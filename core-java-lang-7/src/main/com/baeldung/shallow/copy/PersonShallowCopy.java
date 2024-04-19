package com.baeldung.shallow.copy;

public class PersonShallowCopy {

    public String name;
    public int age;

    public PersonShallowCopy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonShallowCopy{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
