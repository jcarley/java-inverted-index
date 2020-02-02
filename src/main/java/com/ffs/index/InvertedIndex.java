package com.ffs.index;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class InvertedIndex {

    public static Iterable<String> extractTerms(String text) {
        String token = "";
        ArrayList<String> list = new ArrayList<String>();
        StringTokenizer tokenizer = new StringTokenizer(text);

        while(tokenizer.hasMoreTokens()) {
           token = tokenizer.nextToken();
           list.add(token);
        }

        return list;
    }

    public static Iterable<String> lowerCaseFilter(Iterable<String> terms) {
        ArrayList<String> list = new ArrayList<String>();

        for(String term: terms) {
            list.add(term.toLowerCase());
        }

        return list;
    }
}
