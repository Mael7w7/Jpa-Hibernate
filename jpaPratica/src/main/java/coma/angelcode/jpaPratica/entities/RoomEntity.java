package coma.angelcode.jpaPratica.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name="Room")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RoomEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 10)
    private String number;

    @Column(nullable = false,length = 100)
    private String type;

    @Column(nullable = false)
    private BigDecimal price;


    //RELACION DE MUCHOS A UNO CON HOTELENTITY

    @ManyToOne
    @JoinColumn(name="id_hotel")
    private HotelEntity hotelEntity;


    //RELACION DE UNO A MUCHOS CON RESERVATIONENTITY
    @OneToMany(mappedBy = "roomEntity")
    private List<ReservationEntity> reservations;

}
