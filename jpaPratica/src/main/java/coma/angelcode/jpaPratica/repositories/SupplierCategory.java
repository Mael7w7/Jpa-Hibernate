package coma.angelcode.jpaPratica.repositories;

import coma.angelcode.jpaPratica.entities.SupplierEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierCategory extends JpaRepository<SupplierEntity,Long> {
}
