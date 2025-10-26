package coma.angelcode.jpaPratica.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="Patiente")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PatientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100,nullable = false)
    private String PatientName;

    @Column(length = 10,nullable = false)
    private String dni;

    private LocalDate dateOfBirth;

    @Column(length = 10,nullable = false)
    private String phoneNumber;

    //RELACION DE UNO A MUCHOS CON QUOTEENTITY
    @OneToMany(mappedBy = "patientEntity",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<QuoteEntity> quote;






}
