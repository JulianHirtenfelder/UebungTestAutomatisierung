package org.campus02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person person;

    @BeforeEach
    void setUp() {
        person = new Person(
                "max",
                "mustermann",
                'M',
                22,
                "AUT",
                2000,
                "blau",
                80,
                180);
    }

    @Test
    void testConstructor() {
        Assertions.assertEquals("max", person.getFirstname());
        Assertions.assertEquals("mustermann", person.getLastname());
        Assertions.assertEquals("blau", person.getEyeColor());
    }
    @Test
    void setEyeColor() {
        person.setEyeColor("grün");
        Assertions.assertEquals(person.getEyeColor(), "grün");

        person.setEyeColor("orange");
        Assertions.assertEquals(person.getEyeColor(), "undefined");
    }
}