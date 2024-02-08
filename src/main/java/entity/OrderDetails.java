package entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@ToString
@Entity
public class OrderDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String itemId;
    private double cost;
    private double additionalCost;
    private String note;

    @ManyToOne
    @JoinColumn(name = "orderId")
    private Orders orders;

}
