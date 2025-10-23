package coma.angelcode.jpaPratica.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="Department")
public class departmentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100,nullable = false)
    private String name;

    @Column(length = 100,nullable = false)
    private String ubicacion;


    //relacion de uno a mucho con employees
    @OneToMany(mappedBy = "department",cascade = CascadeType.ALL)
    private List<EmployeesEntity> employees;

}
