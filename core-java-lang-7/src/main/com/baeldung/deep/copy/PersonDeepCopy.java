package com.baeldung.deep.copy;

public class PersonDeepCopy implements Cloneable {

    public String name;
    public int age;

    public PersonDeepCopy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public PersonDeepCopy clone() {
        try {
            return (PersonDeepCopy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "PersonDeepCopy{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
