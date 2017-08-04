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
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "inv_id") @Getter @Setter
    long id;

    @NonNull @Getter @Setter
    int count;



}
