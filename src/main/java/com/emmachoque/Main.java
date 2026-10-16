package main.java.com.emmachoque;

import java.io.Console;

public class Main {
    public static void main(String[] args) {
        Console console = System.console();
        if (console == null) {
            System.err.println("No console available");
        }
    }
}
