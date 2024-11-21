package org.example;

public class Main {
    public static void main(String[] args) {
        FunctionalArray f = new FunctionalArray(7);
        System.out.println(f);
        f.set(0, 99);
        f.set(1, 1000);
        f.set(4, 50);
        System.out.println(f);

        System.out.println(f.get(0));
        System.out.println(f.get(1));
        System.out.println(f.get(2));
        System.out.println(f.get(3));
        System.out.println(f.get(4));
        System.out.println(f.get(5));
    }
}