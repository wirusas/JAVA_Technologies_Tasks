package lt.techin.cinema.exceptions.handler;

import lt.techin.cinema.exceptions.SeatNotFoundException;
import lt.techin.cinema.exceptions.TicketPurchasedException;
import lt.techin.cinema.exceptions.TransactionSucceded;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
@ExceptionHandler(SeatNotFoundException.class)
    public ResponseEntity<ErrorDetails>exceptionSeatNotFound(SeatNotFoundException ex){
ErrorDetails errorDetails = new ErrorDetails(ex.getMessage());
return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(TicketPurchasedException.class)
    public ResponseEntity<ErrorDetails>exceptionTicketPurchase(TicketPurchasedException ex){
        ErrorDetails errorDetails = new ErrorDetails(ex.getMessage());
        return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(TransactionSucceded.class)
    public ResponseEntity<ErrorDetails>exceptiontransactionSucceded(TransactionSucceded ex){
        ErrorDetails errorDetails = new ErrorDetails(ex.getMessage());
        return new ResponseEntity<>(errorDetails, HttpStatus.ACCEPTED);
    }
}
