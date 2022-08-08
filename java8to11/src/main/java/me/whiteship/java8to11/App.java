package me.whiteship.java8to11;

import java.util.ArrayList;
import java.util.Spliterator;

public class App {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("heeweon");
        name.add("hee");
        name.add("toby");
        name.add("foo");

        name.sort(String::compareToIgnoreCase);
        name.forEach(System.out::println);

    }
}
