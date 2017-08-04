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
public class Fares {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "fare_id") @Getter @Setter
    long id;

    @NonNull @Getter @Setter
    String fare;
    @NonNull @Getter @Setter
    String currency;

}
