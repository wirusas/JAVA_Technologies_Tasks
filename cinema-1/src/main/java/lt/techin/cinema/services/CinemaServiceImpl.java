package lt.techin.cinema.services;

import lt.techin.cinema.model.Cinema;
import org.springframework.stereotype.Service;

@Service
public class CinemaServiceImpl implements CinemaService{
private Cinema cinema = new Cinema();
    @Override
    public Cinema getCinema() {
        return cinema;
    }
}
