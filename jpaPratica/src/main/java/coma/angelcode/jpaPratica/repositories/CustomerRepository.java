package coma.angelcode.jpaPratica.repositories;

import coma.angelcode.jpaPratica.entities.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {
}
