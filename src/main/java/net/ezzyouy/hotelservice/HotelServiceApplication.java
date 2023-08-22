package net.ezzyouy.hotelservice;

import net.ezzyouy.hotelservice.entities.Reservation;
import net.ezzyouy.hotelservice.entities.ReservationStatus;
import net.ezzyouy.hotelservice.repositories.ReservationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HotelServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HotelServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ReservationRepository rr){
        return  args -> {
            rr.save(Reservation.builder().title("Res 1").price(1200).status(ReservationStatus.CREEATED).build());
            rr.save(Reservation.builder().title("Res 2").price(700).status(ReservationStatus.CONFIRMED).build());
            rr.save(Reservation.builder().title("Res 3").price(2050).status(ReservationStatus.CANCELED).build());
        };
    }
}
