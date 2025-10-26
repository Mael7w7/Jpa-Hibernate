package coma.angelcode.jpaPratica.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="Quote")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class QuoteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100,nullable = false)
    private LocalDate date;

    @Column(length = 100,nullable = false)
    private String description;

    //RELACION DE MUCHOS A UNO CON PATIENTEENTITY
    @ManyToOne
    @JoinColumn(name="id_PatienteEntity")
    private PatientEntity patientEntity;

    //RELACION DE UNOS A MUCHOS CON PRESCRIPTIOENTITY
    @OneToMany(mappedBy = "quoteEntity")
    private List<PrescriptionEntity> prescription;

    //RELACION DE MUCHSO A UNO
    @ManyToOne
    @JoinColumn(name="id_DoctorEntity")
    private DoctorEntity doctorEntity;


}
