package coma.angelcode.jpaPratica.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import java.util.List;

@Entity
@Table(name = "Category")
@Data
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100,nullable = false,unique = true)
    private String nameCategory;

    @Column(length = 100)
    private String descriptionCategory;

    //relacin de uno a mucho con products

    @OneToMany(mappedBy = "category",cascade = CascadeType.ALL)
    private List<ProductEntity> products;






}
