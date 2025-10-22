package coma.angelcode.jpaPratica.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "customers")
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false,unique = true)
    private String CustomerName;

    @Column(length = 100)
    private String email;

    @Column(length = 10)
    private String phoneNumber;

    @Column(length = 100)
    private String address;

    //un cliente puede tener muchas ventas
    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    private List<SaleEntity> sales;


}
