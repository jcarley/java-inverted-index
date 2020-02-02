package com.ffs.index;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class InvertedIndexTests {

    @Test
    void extractTermsFromString() {
        var text = "Turtles love pizza";
        var expected = new ArrayList<String>();
        expected.add("Turtles");
        expected.add("love");
        expected.add("pizza");
        var actual = InvertedIndex.extractTerms(text);
        assertIterableEquals(actual, expected);
    }


    @Test
    void lowerCaseAllTerms() {
        var terms = new ArrayList<String>();
        terms.add("TurTleS");
        terms.add("LovE");
        terms.add("PiZzA");

        var actual = InvertedIndex.lowerCaseFilter(terms);

        var expected = new ArrayList<String>();
        expected.add("turtles");
        expected.add("love");
        expected.add("pizza");

        assertIterableEquals(actual, expected);
    }
}
