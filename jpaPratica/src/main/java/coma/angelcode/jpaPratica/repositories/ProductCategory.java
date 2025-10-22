package coma.angelcode.jpaPratica.repositories;

import coma.angelcode.jpaPratica.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCategory extends JpaRepository<ProductEntity,Long> {
}
