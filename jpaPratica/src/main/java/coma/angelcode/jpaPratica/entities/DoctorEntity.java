package coma.angelcode.jpaPratica.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="Doctor")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DoctorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100,nullable = false)
    private String doctorName;

    @Column(length = 100,nullable = false)
    private String speciality;

    @Column(length = 10,nullable = false)
    private String phoneNumber;

    //RELACION DE UNO A MUCHOS CON QUOTEENTITY
    @OneToMany(mappedBy = "doctorEntity",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<QuoteEntity> quotes;



}
