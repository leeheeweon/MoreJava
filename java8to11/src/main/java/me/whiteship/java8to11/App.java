package me.whiteship.java8to11;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("heeweon");
        names.add("hee");
        names.add("toby");
        names.add("foo");

        List<String> collect1 = names.parallelStream().map(String::toUpperCase).collect(Collectors.toList());
        collect1.forEach(System.out::println);

        List<String> collect = names.stream().map((s) -> {
            return s.toUpperCase();
        }).collect(Collectors.toList());

        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
