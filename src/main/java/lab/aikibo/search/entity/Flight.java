package lab.aikibo.search.entity;

import lombok.*;

import javax.persistence.*;

/**
 * Created by tamami on 04/08/17.
 */
@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter @Setter
    long id;

    @NonNull @Getter @Setter
    String flightNumber;
    @NonNull @Getter @Setter
    String origin;
    @NonNull @Getter @Setter
    String destination;
    @NonNull @Getter @Setter
    String flightDate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fare_id")
    @NonNull @Getter @Setter
    Fares fares;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "inv_id")
    @NonNull @Getter @Setter
    Inventory inventory;

}
