package net.ezzyouy.hotelservice.web;

import lombok.AllArgsConstructor;
import net.ezzyouy.hotelservice.entities.Reservation;
import net.ezzyouy.hotelservice.repositories.ReservationRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ReservationController {
    private ReservationRepository rr;

    @GetMapping(path = "/reservations")
    public List<Reservation> reservationList(){
        return rr.findAll();
    }

}
