package me.whiteship.java8to11;

@FunctionalInterface
public interface RunSomething {
    int doIt(int number);

    static void printName() {
        System.out.println("heeweon");
    }

    default void printAge() {
        System.out.println("29");
    }
}
