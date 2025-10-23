package coma.angelcode.jpaPratica.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="proyect")
@Data
public class ProyectEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,length = 100)
    private String proyectName;

    @Column(nullable = false,length = 100)
    private LocalDate startDate;

    @Column(nullable = false,length = 100)
    private LocalDate endDate;

    //relaacion de uno a muchos con employess
    @OneToMany(mappedBy = "proyect",cascade = CascadeType.ALL)
    private List<EmployeesEntity> employees;




}
