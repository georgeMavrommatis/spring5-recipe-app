package gr.gmavrommatis.recipe.repositories;

import gr.gmavrommatis.recipe.domain.Category;
import gr.gmavrommatis.recipe.domain.Recipe;
import gr.gmavrommatis.recipe.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * UnitOfMeasureRepository interface created 16-Aug-21
 *
 * @author G.MAVROMMATIS
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
