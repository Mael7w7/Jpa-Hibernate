package coma.angelcode.jpaPratica.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="sale")
public class SaleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;
    private BigDecimal total;

    //relacion de muchos aaa uno customers
    @ManyToOne
    @JoinColumn(name="customer_id")
    private CustomerEntity customer;



    //relacion de uno a muchos con salesDetalies
    @OneToMany(mappedBy = "saleDetalies",cascade = CascadeType.ALL)
    private List<SaleDetalies> saleDetalies;

}
