package lab.aikibo.search.entity;

import javax.persistence.*;

/**
 * Created by tamami on 04/08/17.
 */
@Entity
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    String flightNumber;
    String origin;
    String destination;
    String flightDate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fare_id")
    Fares fares;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "inv_id")
    Inventory inventory;

}
