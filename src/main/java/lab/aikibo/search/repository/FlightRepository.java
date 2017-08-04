package lab.aikibo.search.repository;

import lab.aikibo.search.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by tamami on 04/08/17.
 */
public interface FlightRepository extends JpaRepository<Flight, Long> {

}
