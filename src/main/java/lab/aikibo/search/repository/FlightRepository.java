package lab.aikibo.search.repository;

import lab.aikibo.search.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by tamami on 04/08/17.
 */
public interface FlightRepository extends JpaRepository<Flight, Long> {

    List<Flight> findByOriginAndDestinationAndFlightDate(String origin, String destination, String flightDate);
    Flight findByFlightNumberAndFlightDate(String flightNumber, String flightDate);

}
