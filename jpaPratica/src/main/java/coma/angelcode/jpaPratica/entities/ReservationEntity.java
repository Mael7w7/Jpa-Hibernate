package coma.angelcode.jpaPratica.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "Reservation")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate startDate;
    private LocalDate endDate;

    //RELACION DE MUCHOS A UNO CON ROOMENTITY
    @ManyToOne
    @JoinColumn(name = "id_room")
    private RoomEntity roomEntity;

    //RELACION DE MUCHOS A UNO CON CUSTOMERENTITY
    @ManyToOne
    @JoinColumn(name = "id_customer")
    private CustomerEntity customerEntity;

}
