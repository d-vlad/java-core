package com.baeldung.shallow.copy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;

public class PersonShallowCopyTest {

    @Test
    public void whenFieldsModified_ChangesReflectShallowCopy() {
        PersonShallowCopy p = new PersonShallowCopy(null, 0);
        assertNotNull(p);

        PersonShallowCopy pCopy = p;
        p.age = 10;
        p.name = "test";

        assertEquals(10, pCopy.age);
        assertEquals("test", pCopy.name);
    }
}