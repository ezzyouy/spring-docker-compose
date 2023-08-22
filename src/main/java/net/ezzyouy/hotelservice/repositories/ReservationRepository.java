package net.ezzyouy.hotelservice.repositories;

import net.ezzyouy.hotelservice.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
