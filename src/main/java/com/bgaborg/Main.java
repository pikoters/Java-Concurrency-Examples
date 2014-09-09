package com.bgaborg;

import com.bgaborg.threadobjects.ThreadObjectsPart;

import java.util.LinkedList;

/**
 * Created by bg
 */
public class Main {

    static LinkedList<AppExample> examples = new LinkedList<>();

    public static void main(String[] args) {
        examples.add(new ThreadObjectsPart());

        try {
            for (AppExample appExample : examples) {
                appExample.startExample();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}