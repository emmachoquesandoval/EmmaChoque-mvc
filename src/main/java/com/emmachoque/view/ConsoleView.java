package com.emmachoque.view;

import com.emmachoque.model.Reservation;

import java.util.List;
import java.util.Scanner;

public class ConsoleView {
    private final Scanner scanner = new Scanner(System.in);

    public String showMenuAndReadOption() {
        System.out.println("\n--- Reserva de libros ---");
        System.out.println("1. Nueva reserva");
        System.out.println("2. Lista de reservas");
        System.out.println("0. Salir");
        System.out.print("Elige una opción: ");
        return scanner.nextLine().trim();
    }

    public String askUserName() {
        System.out.print("Nombre del usuario: ");
        return scanner.nextLine().trim();
    }

    public String askBookTitle() {
        System.out.print("Título del libro: ");
        return scanner.nextLine().trim();
    }

    public void showConfirmation(Reservation reservation) {
        System.out.println("Reserva realizada: " + reservation.getUser().getUsername()
                + " ha reservado \"" + reservation.getBook().getTitle() + "\"");
    }

    public void showReservations(List<Reservation> reservations) {
        if (reservations.isEmpty()) {
            System.out.println("Todavía no hay reservas.");
            return;
        }

        System.out.println("\n--- Lista de reservas ---");
        for (Reservation reservation : reservations) {
            System.out.println(reservation);
        }
    }

    public void showError(String message) {
        System.out.println("Error: " + message);
    }

    public void showGoodbye() {
        System.out.println("Hasta luego.");
    }
}
