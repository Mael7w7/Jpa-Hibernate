package coma.angelcode.jpaPratica.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name="PrescriptionEntity")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PrescriptionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100,nullable = false)
    private String description;

    @Column(length = 100,nullable = false)
    private LocalDate issueDate;

    //RELACION DE MUCHOS A UNO
    @ManyToOne
    @JoinColumn(name="id_quote")
    private QuoteEntity quoteEntity;

}
