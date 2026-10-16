package com.emmachoque.model;

import java.util.ArrayList;
import java.util.List;

public class ReservationService {
    private final List<com.emmachoque.model.Reservation> reservations = new ArrayList<>();

    public Reservation reserve(User user, Book book) {
        Reservation reservation = new Reservation(user, book);
        reservations.add(reservation);
        return reservation;
    }

    public List<Reservation> getAllReservations() {
        return new ArrayList<>(reservations);
    }
}
