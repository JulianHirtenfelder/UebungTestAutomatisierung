package org.campus02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CountryAnalyzerTest {

    CountryAnalyzer analyzer;
    ArrayList<Person> list;

    @BeforeEach
    void setUp() {
        analyzer = new CountryAnalyzer();
        list = new ArrayList<>();

        list.add(new Person("Julian", "Hirtenfelder", 'M', 21, "Austria",
                30000, "blue", 94, 185));

        list.add(new Person("Celina", "xy", 'F', 15, "Germany",
                30000, "blue", 94, 160));

        list.add(new Person("Julienco", "Hirtenfelder", 'M', 14, "Austria",
                30000, "blue", 94, 200));

        list.add(new Person("Julius", "Hirtenfelder", 'M', 35, "Germany",
                30000, "blue", 94, 177));

        list.add(new Person("Juliane", "Hirtenfelder", 'F', 76, "Germany",
                30000, "blue", 94, 167));


        analyzer.setPersons(list);
    }


    @Test
    void analyze() {
        //Setup
        int austriaShouldBe = 2;
        int germanyShouldBe = 3;

        //Execute
        analyzer.analyze();

        //Verify
        Assertions.assertEquals(austriaShouldBe, analyzer.getResult().get("Austria"));
        Assertions.assertEquals(germanyShouldBe, analyzer.getResult().get("Germany"));
    }
}