package com.baeldung.deep.copy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;

public class PersonDeepCopyTest {

    @Test
    public void whenCloneExecuted_NewDeepCopyCreated() {
        PersonDeepCopy p = new PersonDeepCopy(null, 0);
        assertNotNull(p);
        int age = p.age;
        String name = p.name;
        PersonDeepCopy pCopy = p.clone();
        p.age = 10;
        p.name = "test";

        assertEquals(age, pCopy.age);
        assertEquals(name, pCopy.name);
    }
}
