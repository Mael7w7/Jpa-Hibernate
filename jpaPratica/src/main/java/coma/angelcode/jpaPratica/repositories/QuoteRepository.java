package coma.angelcode.jpaPratica.repositories;

import coma.angelcode.jpaPratica.entities.QuoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuoteRepository extends JpaRepository<QuoteEntity, Long> {

}
