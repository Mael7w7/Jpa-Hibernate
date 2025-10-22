package coma.angelcode.jpaPratica.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name="products")
public class ProductsEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(unique=true,length=100,nullable = false)
    private String productName;

    @Column(nullable = false)
    private BigDecimal price;

    @Column(nullable = false)
    private Integer stockProducts;



    //relacion de uno a muchos saleDetalies
    @OneToMany(mappedBy = "products",cascade =CascadeType.ALL)
    private List<SaleDetalies> sales;

}
