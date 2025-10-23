package coma.angelcode.jpaPratica.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

@Entity
@Table(name="Employees")
@Data
public class EmployeesEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,length=100)
    private String  name;

    @Column(nullable = false,length = 100)
    private String post;

    @Column(nullable = false)
    private BigDecimal salary;


    //relacion de muchos a uno con depaartmen
    @ManyToOne
    @JoinColumn(name = "department_id")
    private departmentEntity department;


    //relacion de muchos  uno con proyect
    @ManyToOne
    @JoinColumn(name="proyect_id")
    private ProyectEntity proyect;

}
