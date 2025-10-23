package coma.angelcode.jpaPratica.entities;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name="loan")
public class LoanEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private LocalDate createdAt;

    private LocalDate updatedAt;

    @Column(length = 200)
    private String status;


    //Muchos prestamos puede tener un libro
    @ManyToOne
    @JoinColumn(name = "loan_id")
    private bookEntity bookEntity;


    //muchos prestamos puede tener un usuario
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity userEntity;

}
