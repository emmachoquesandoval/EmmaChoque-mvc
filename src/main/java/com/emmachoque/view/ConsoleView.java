package main.java.com.emmachoque.view;

import java.util.Scanner;

public class ConsoleView {
    private Scanner scanner;
    public ConsoleView() {
        scanner = new Scanner(System.in);
    }
    public void print(String message) {
        System.out.println(message);
    }
    public void print(String message, Object... args) {
        System.out.printf(message, args);
    }
}
