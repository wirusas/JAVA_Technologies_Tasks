package lt.techin.cinema.exceptions;

public class SeatNotFoundException extends RuntimeException{
    public SeatNotFoundException(String message)
    {super(message);}
}
