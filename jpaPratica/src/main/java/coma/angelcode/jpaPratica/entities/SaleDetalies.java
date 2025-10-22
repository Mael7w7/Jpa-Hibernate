package coma.angelcode.jpaPratica.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "SaleDetalies")
@Data

public class SaleDetalies {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Integer quantity;
    private BigDecimal unitPrice;
    private BigDecimal subtotal;

    //relacion de muchos a uno con salesEntity
    @ManyToOne
    @JoinColumn(name="sales_id")
    private SaleEntity saleDetalies;


    //relacion de muchos a uno con productosEntity
    @ManyToOne
    @JoinColumn(name="prodcuts_id")
    private ProductsEntity products;

}
