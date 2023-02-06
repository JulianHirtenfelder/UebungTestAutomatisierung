package org.campus02;

import java.util.ArrayList;

public class BMIAnalyzer extends PersonAnalyzer {
    private ArrayList<Pair<Person, Double>> result = new ArrayList<>();

    public ArrayList<Pair<Person, Double>> getResult() {
        return result;
    }

    public static double calcBmi(Person person) {
        return Math.round((person.getWeight() / ((person.getSize() / 10.0) * (person.getSize() / 1000.0)))*100.0)/100.0;
    }

    @Override
    public void analyze() {
        for (Person person : super.getPersons()) {
            double bmi = calcBmi(person);
            Pair<Person, Double> bmiPair = new Pair<>(person, bmi);
            result.add(bmiPair);
        }
    }
}
