package online.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import online.entity.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class ProductCard {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hibernate_seq")
    @SequenceGenerator(name = "hibernate_seq", sequenceName = "product_card_seq", allocationSize = 1)
    @Column(name = "product_card_id")
    Long id;

//    @JsonIgnore
    @OneToOne
    Products productId;

    int count = 1;
}
