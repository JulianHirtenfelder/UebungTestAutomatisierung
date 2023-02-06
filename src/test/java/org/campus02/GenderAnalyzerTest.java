package org.campus02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GenderAnalyzerTest {

    /**
     * Test the result of avgM and avgW
     */
    GenderAnalyzer analyzer;
    ArrayList<Person> list;

    @BeforeEach
    void setUp() {
        analyzer = new GenderAnalyzer();
        list = new ArrayList<>();

        list.add(new Person("Julian", "Hirtenfelder", 'M', 21, "Austria",
                30000, "blue", 94, 185));

        list.add(new Person("Celina", "xy", 'F', 15, "Austria",
                30000, "blue", 94, 160));

        list.add(new Person("Julienco", "Hirtenfelder", 'M', 14, "Austria",
                30000, "blue", 94, 200));

        list.add(new Person("Julius", "Hirtenfelder", 'M', 35, "Austria",
                30000, "blue", 94, 177));

        list.add(new Person("Juliane", "Hirtenfelder", 'F', 76, "Austria",
                30000, "blue", 94, 167));


        analyzer.setPersons(list);
    }


    @Test
    void analyze() {
        //Setup
        int maleShouldBe = 187;
        int femaleShouldBe = 163;

        //Execute
        analyzer.analyze();

        int maleResult = analyzer.getAvgM();
        int femaleResult = analyzer.getAvgW();

        //Verify
        Assertions.assertEquals(maleShouldBe, maleResult);
        Assertions.assertEquals(femaleShouldBe, femaleResult);
    }
}