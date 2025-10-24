package coma.angelcode.jpaPratica.repositories;

import coma.angelcode.jpaPratica.entities.HotelEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface HotelRepository extends JpaRepository<HotelEntity, Long> {
}
