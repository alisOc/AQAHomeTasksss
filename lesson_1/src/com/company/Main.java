package com.company;

public class Main {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    // задание 1
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    // задание 2
    public static void checkSumSign() {
        int a = 36;
        int b = 43;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Summa positive");
        } else {
            System.out.println("Summa negative");
        }
    }
    // задание 3
    public static void printColor() {
        int value = 78;
        if (value <= 0) {
            System.out.println("Red");
        } else if (value > 0 && value < 100) {
            System.out.println("Yellow");
        } else if (value >= 100) {
            System.out.println("Green");
        } else {
            System.out.println("No color");
        }
    }
    //задание 4
    public static void compareNumbers() {
        int a = 38;
        int b = 198;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
