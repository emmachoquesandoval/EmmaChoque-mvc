package com.emmachoque.controller;

import com.emmachoque.model.Book;
import com.emmachoque.model.Reservation;
import com.emmachoque.model.ReservationService;
import com.emmachoque.model.User;
import com.emmachoque.view.ConsoleView;

public class ReservationController {
    private final ReservationService service;
    private final ConsoleView view;

    public ReservationController(ReservationService service, ConsoleView view) {
        this.service = service;
        this.view = view;
    }

    public void start() {
        boolean running = true;

        while (running) {
            String option = view.showMenuAndReadOption();
            switch (option) {
                case "1":
                    createReservation();
                    break;
                case "2":
                    view.showReservations(service.getAllReservations());
                    break;
                case "0":
                    view.showGoodbye();
                    running = false;
                    break;
                default:
                    view.showError("Elige 1, 2 o 0.");
            }
        }
    }

    private void createReservation() {
        String username = view.askUserName();
        if (username.trim().isEmpty()) {
            view.showError("el nombre no puede estar vacío.");
            return;
        }

        String title = view.askBookTitle();
        if (title.trim().isEmpty()) {
            view.showError("el título no puede estar vacío.");
            return;
        }

        User user = new User(username);
        Book book = new Book(title);
        Reservation reservation = service.reserve(user, book);
        view.showConfirmation(reservation);
    }
}
