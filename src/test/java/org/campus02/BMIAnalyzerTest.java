package org.campus02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BMIAnalyzerTest {

    BMIAnalyzer analyzer;
    Person p;

    @BeforeEach
    void setUp() {
        analyzer = new BMIAnalyzer();
        p = new Person("Julian", "Hirtenfelder", 'm', 21, "Austria",
                30000, "blue", 94, 185);
    }

    @Test
    void calcBmi() {
        //Setup
        double myBMI = 27.47; //ausgerechnet mit Online-Rechner

        //Exercise
        double calculatedBMI = BMIAnalyzer.calcBmi(p);

        //Verify
        Assertions.assertEquals(myBMI, calculatedBMI);
    }

    /**
     * check result
     */
    @Test
    void analyze() {
        //Setup

        ArrayList<Person> list = new ArrayList<>();
        list.add(p);
        analyzer.setPersons(list);

        //Exercise
        analyzer.analyze();
        ArrayList<Pair<Person, Double>> pair = analyzer.getResult();

        //Verify
        Assertions.assertEquals(pair.get(0).getKey().getFirstname(), "Julian");
        Assertions.assertEquals(pair.get(0).getValue(), 27.47);
    }
}