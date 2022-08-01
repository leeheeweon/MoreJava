package me.whiteship.java8to11;

import java.util.function.*;

public class Foo {
    public static void main(String[] args) {
        //익명 내부 클래스
        RunSomething runSomething = number -> number + 10;

        System.out.println(runSomething.doIt(1));

        //동일
        Function<Integer, Integer> plus10 = (i) -> i + 10;
        UnaryOperator<Integer> Uplus10 = (i) -> i + 10;

        System.out.println(plus10.apply(1));

        Function<Integer, Integer> multiply2 = (i) -> i * 2;
        System.out.println(multiply2.apply(1));


        Function<Integer, Integer> multiply2AndPlus10 = plus10.compose(multiply2);
        System.out.println(multiply2AndPlus10.apply(2));

        Function<Integer, Integer> plus10AndThenMultiply2 = plus10.andThen(multiply2);
        System.out.println(plus10AndThenMultiply2.apply(2));

        Consumer<Integer> print = (i) -> System.out.println(i);
        print.accept(100);

        Supplier<Integer> get10 = () -> 10;
        System.out.println(get10.get());

        Predicate<String> startsWithHeeweon = (s) -> s.startsWith("Heeweon");
        Predicate<String> length = (s) -> s.length() < 10;

        Predicate<Integer> isEven = (i) -> i % 2 == 0;

        System.out.println(startsWithHeeweon.test("Heeweon"));

        Predicate<String> startHAnd4 = startsWithHeeweon.and(length);
        System.out.println(startHAnd4.test("Heeweon"));
        System.out.println(startHAnd4.test("Heeweon111"));

        Supplier<Integer> get20 = () -> 20;
        System.out.println(get20);
    }
}
