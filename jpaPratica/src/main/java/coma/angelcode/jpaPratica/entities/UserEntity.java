package coma.angelcode.jpaPratica.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@Data
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false, length = 100)
    private String userName;

    @Column(nullable = false, length = 200)
    private String email;

    @Column(length = 10)
    private String phoneNumber;

    @Column(length = 200)
    private String address;


    //UN USUARIO PUEDE TENER MUCHOS PRESTAMOS
    @OneToMany(mappedBy = "userEntity",cascade = CascadeType.ALL)
    private List<LoanEntity> loanEntityList;

}
