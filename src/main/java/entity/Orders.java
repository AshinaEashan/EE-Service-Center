package entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@ToString
@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String itemCategory;
    private String date;
    private String customerId;
    private String email;

    @OneToMany(mappedBy = "orders")
    private List<OrderDetails> orderDetails;

}
