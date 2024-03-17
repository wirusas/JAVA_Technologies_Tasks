package lt.techin.cinema.services;

import lt.techin.cinema.exceptions.SeatNotFoundException;
import lt.techin.cinema.exceptions.TicketPurchasedException;
import lt.techin.cinema.exceptions.TransactionSucceded;
import lt.techin.cinema.model.Cinema;
import lt.techin.cinema.model.Seat;
import lt.techin.cinema.repositories.CinemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CinemaServiceImpl implements CinemaService {

    private final CinemaRepository cinemaRepository;

    private Cinema cinema = new Cinema();

    @Autowired
    public CinemaServiceImpl(CinemaRepository cinemaRepository) {
        this.cinemaRepository = cinemaRepository;
    }

    @Override
    public Cinema getCinemaSeats() {
        return cinema;
    }

    @Override
    public Seat buyTicket(Seat newSeat) {

        if (newSeat.getRow() < 1 || newSeat.getRow() > cinema.getRows() ||
                newSeat.getColumn() < 1 || newSeat.getColumn() > cinema.getColumns()) {
            throw new SeatNotFoundException("The number of a row or a column is out of bounds!");
        }

        Seat tempSeat = cinema.getSeats().stream()
                .filter(seat -> seat.getRow() == newSeat.getRow() && seat.getColumn() == newSeat.getColumn())
                .findFirst()
                .orElseThrow(() -> new SeatNotFoundException("error: " + "The number of a row or a column is out of bounds!"));

        if (tempSeat.isOccupied()) {
            throw new TicketPurchasedException("The ticket has already been purchased!");
        } else {
            tempSeat.setOccupied(true);

return tempSeat;

//            throw new TransactionSucceded("Thank you");
        }



    }

}


