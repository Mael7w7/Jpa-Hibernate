package coma.angelcode.jpaPratica.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "suppliers")
public class SupplierEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100,nullable = false,unique = true)
    private String supplierName;

    @Column(length = 10)
    private String phoneNumber;

    @Column(length = 100)
    private String email;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProductEntity product;
}
