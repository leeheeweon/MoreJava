package me.whiteship.java8to11;

import java.time.Duration;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        List<OnlineClass> springClasses = new ArrayList<>();
        springClasses.add(new OnlineClass(1, "spring boot", true));
        springClasses.add(new OnlineClass(2, "spring data jpa", true));
        springClasses.add(new OnlineClass(3, "spring mvc", false));
        springClasses.add(new OnlineClass(4, "spring core", false));
        springClasses.add(new OnlineClass(5, "rest api development", false));

        Optional<OnlineClass> spring = springClasses.stream().filter(oc -> oc.getTitle().startsWith("jpa")).findFirst();
        OnlineClass onlineClass = spring.orElse();
        System.out.println(onlineClass.getTitle());
    }

    private static OnlineClass creatNewClass() {
        System.out.println("creating new class");
        return new OnlineClass(10, "New class", false);
    }
}
