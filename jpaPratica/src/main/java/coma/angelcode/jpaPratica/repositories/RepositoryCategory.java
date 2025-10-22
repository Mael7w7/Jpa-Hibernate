package coma.angelcode.jpaPratica.repositories;

import coma.angelcode.jpaPratica.entities.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryCategory extends JpaRepository<CategoryEntity,Long> {
}
