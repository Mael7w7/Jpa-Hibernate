package coma.angelcode.jpaPratica.repositories;

import coma.angelcode.jpaPratica.entities.ReservationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<ReservationEntity, Long> {
}
