package coma.angelcode.jpaPratica.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class bookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,length = 200,unique = true)
    private String title;

    @Column(nullable = false,length = 200)
    private String author;

    @Column(nullable = false,length = 200)
    private String Editorial;

    private Integer year;

    private Integer stock;

    //Un libro puede tener muchos prestaamos
    @OneToMany(mappedBy = "bookEntity",cascade = CascadeType.ALL)
    private List<LoanEntity> loanEntityList;

}
