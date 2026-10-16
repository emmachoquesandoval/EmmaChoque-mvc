package com.emmachoque;

import com.emmachoque.controller.ReservationController;
import com.emmachoque.model.ReservationService;
import com.emmachoque.view.ConsoleView;

public class MainMVC {
    public static void main(String[] args) {
        ReservationService service = new ReservationService();
        ConsoleView view = new ConsoleView();
        ReservationController controller = new ReservationController(service, view);

        controller.start();
    }
}
