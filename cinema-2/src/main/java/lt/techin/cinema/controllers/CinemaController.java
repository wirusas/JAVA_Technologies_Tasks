package lt.techin.cinema.controllers;

import lt.techin.cinema.CinemaApplication;
import lt.techin.cinema.model.Cinema;
import lt.techin.cinema.model.Seat;
import lt.techin.cinema.services.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/seats")
public class CinemaController {
    private final CinemaService cinemaService;

    @Autowired
    public CinemaController(CinemaService cinemaService) {
        this.cinemaService = cinemaService;
    }

    @GetMapping
    public Cinema getCinemaSeats() {
        return cinemaService.getCinemaSeats();
    }

    @PostMapping("/purchase")
public Seat buyTicket(@RequestBody Seat newSeat){
        return cinemaService.buyTicket(newSeat);
    }
}
