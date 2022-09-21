package com.company;

@MyAnnotation(value = "heeweon", number = 100)
public class Book {
    private String a;
    private static String B = "BOOK";
    private static final String C = "BOOK";
    public String d = "d";
    protected String e = "e";

    public Book() {

    }

    public Book(String a, String d, String e) {
        this.a = a;
        this.d = d;
        this.e = e;
    }

    private void f() {
        System.out.println("F");
    }

    public void g() {
        System.out.println("G");
    }

    public int h(int a, int b) {
        return a + b;
    }
}
