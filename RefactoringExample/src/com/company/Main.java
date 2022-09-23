package com.company;

import java.lang.reflect.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException, NoSuchFieldException {
        Class<Book> bookClass = Book.class;
        Book book = new Book();
        Class<? extends Book> aClass = book.getClass();
        Class<?> aClass1 = Class.forName("com.company.Book");

        Constructor<?> constructor = aClass1.getConstructor(null);
        Book bookIns = (Book) constructor.newInstance();
        System.out.println(bookIns);

        Field b = Book.class.getDeclaredField("B");
        b.setAccessible(true);
        System.out.println(b.get(null));
        b.set(null, "BBBBB");
        System.out.println(b.get(null));

        Method h = Book.class.getDeclaredMethod("h", int.class, int.class);
        h.setAccessible(true);
        int invoke = (int) h.invoke(book, 10, 20);
        System.out.println(invoke);
        System.out.println(h.getName());


       /* Arrays.stream(bookClass.getDeclaredFields()).forEach(f->{
            f.setAccessible(true);
            try {
                System.out.printf("%s %s\n" ,f ,f.get(book));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        });

        Arrays.stream(bookClass.getMethods()).forEach(System.out::println);
        Arrays.stream(bookClass.getDeclaredConstructors()).forEach(System.out::println);

        Arrays.stream(MyBook.class.getInterfaces()).forEach(System.out::println);
        Arrays.stream(Book.class.getDeclaredFields()).forEach(f->{
            int modifiers = f.getModifiers();
            System.out.println(f);
            System.out.println(Modifier.isPrivate(modifiers));
            System.out.println(Modifier.isPublic(modifiers));
            System.out.println(Modifier.isStatic(modifiers));
            System.out.println(Modifier.isProtected(modifiers));
        });

        Arrays.stream(Book.class.getMethods()).forEach(m->{
            int modifiers = m.getModifiers();
            System.out.println(m);
            System.out.println(m.getReturnType());
        });*/

//        Arrays.stream(MyBook.class.getAnnotations()).forEach(System.out::println);
//
//        System.out.println(MyBook.class.getSuperclass());


    }
}
