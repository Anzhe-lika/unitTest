package org.example;

public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new long[]{4,40,25,600,15});
        System.out.println(salesManager.max());

        System.out.println(salesManager.average());
    }
}