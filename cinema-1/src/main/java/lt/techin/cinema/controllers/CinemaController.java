package lt.techin.cinema.controllers;

import lt.techin.cinema.model.Cinema;
import lt.techin.cinema.services.CinemaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seats")
public class CinemaController {
    private final CinemaService cinemaService;

    public CinemaController(CinemaService cinemaService) {
        this.cinemaService = cinemaService;
    }

    @GetMapping
    public Cinema getCinema() {
        return cinemaService.getCinema();

    }
}
