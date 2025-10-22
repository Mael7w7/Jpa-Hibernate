package coma.angelcode.jpaPratica.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.context.annotation.EnableMBeanExport;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name="Products")
@Data
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String nameProduct;

    @Column(nullable = false)
    private BigDecimal priceProduct;

    @Column(nullable = false)
    private Integer stockProduct;

    @Column(length = 100)
    private String DescriptionProduct;

    //relacion de muchos a uno con categoryEntity
    @ManyToOne
    @JoinColumn(name="category_id")
    private CategoryEntity category;


    //relacion de uno a muchos
    @OneToMany(mappedBy = "product",cascade = CascadeType.ALL)
    private List<SupplierEntity> suppliers;


}
