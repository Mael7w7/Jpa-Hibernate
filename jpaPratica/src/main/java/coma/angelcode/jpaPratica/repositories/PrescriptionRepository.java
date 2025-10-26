package coma.angelcode.jpaPratica.repositories;

import coma.angelcode.jpaPratica.entities.PrescriptionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrescriptionRepository extends JpaRepository<PrescriptionEntity, Long> {
}
