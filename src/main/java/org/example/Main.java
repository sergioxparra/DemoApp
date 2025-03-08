package org.example;
import org.example.calculator;

public class Main {
    public static void main(String[] args) {
        calculator calculator = new calculator();
        int result = calculator.add(2, 3);
        System.out.println("2 + 3 = " + result);
    }
}