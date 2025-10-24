package coma.angelcode.jpaPratica.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="Hotel")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100,nullable = false)
    private String hotelName;

    @Column(length = 100,nullable = false)
    private String hotelAddress;

    @Column(length = 10,nullable = false)
    private String phoneNumber;

    //RELACION DE UNO A MUCHOS CON ROOMENTITY
    @OneToMany (mappedBy = "hotelEntity",cascade = CascadeType.ALL)
    private List<RoomEntity> room;



}
