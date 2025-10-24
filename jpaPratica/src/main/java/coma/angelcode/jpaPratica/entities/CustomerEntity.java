package coma.angelcode.jpaPratica.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="Customers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,length = 100)
    private String customerName;

    @Column( nullable = false,length = 10)
    private String phoneNumber;

    @Column(nullable = false,length = 100)
    private String email;


    //RELACION DE UNO A MUCHOS CON RESERVATIONENTITY

    @OneToMany(mappedBy = "customerEntity")
    private List<ReservationEntity> reservations;

}
