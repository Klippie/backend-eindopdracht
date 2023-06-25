package nl.johanvanderklift.backendeindopdracht.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue
    private Long id;
    private LocalDateTime dateTime;

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "order")
    private List<OrderLine> orderLines;

    @OneToOne
    private Invoice invoice;

}
