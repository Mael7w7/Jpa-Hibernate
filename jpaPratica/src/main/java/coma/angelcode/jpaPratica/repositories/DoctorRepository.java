package coma.angelcode.jpaPratica.repositories;

import coma.angelcode.jpaPratica.entities.DoctorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<DoctorEntity, Long> {
}
