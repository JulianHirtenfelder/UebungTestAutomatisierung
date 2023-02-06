package org.campus02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonManagerTest {
    PersonManager pm;
    Person p;

    @BeforeEach
    void setUp() {
        pm = new PersonManager();
        p = new Person(
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
    void addPerson() {
        pm.addPerson(p);

        Assertions.assertEquals(pm.getPersons().stream().count(), 1);
    }
}