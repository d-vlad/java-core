package com.baeldung;

import com.baeldung.deep.copy.PersonDeepCopy;
import com.baeldung.shallow.copy.PersonShallowCopy;

public class CopyDemo {

    public static void main(String[] args) {

        shallowCopyExample();
        deepCopyExample();

    }

    private static void shallowCopyExample() {
        System.out.println();
        System.out.println("Start Shallow copy example");
        PersonShallowCopy personShallowCopy = new PersonShallowCopy("Vlad Dulgheru", 32);
        System.out.println(personShallowCopy);

        //shallow copy of person P
        PersonShallowCopy copyPersonShallow = personShallowCopy;
        System.out.println(copyPersonShallow);

        System.out.println("Change age and Name of on one of the reference");
        personShallowCopy.age = 33;
        personShallowCopy.name = "Vladut Dulgheru";
        System.out.printf("Modified person: %s%n", personShallowCopy);
        System.out.printf("Shallow copy: %s%n", copyPersonShallow);
    }

    private static void deepCopyExample() {
        System.out.println();
        System.out.println("Start Deep copy example");

        PersonDeepCopy personDeepCopy = new PersonDeepCopy("Vlad Dulgheru", 32);
        System.out.println(personDeepCopy);

        PersonDeepCopy personDeepCopy1 = personDeepCopy.clone();
        System.out.println(personDeepCopy1);

        personDeepCopy.name = "Vladut Dulgheru";
        personDeepCopy.age = 33;
        System.out.printf("Modified person: %s%n", personDeepCopy);
        System.out.printf("Deep copy: %s%n", personDeepCopy1);
    }
}
