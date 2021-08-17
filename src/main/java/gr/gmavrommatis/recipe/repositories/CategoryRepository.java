package gr.gmavrommatis.recipe.repositories;

import gr.gmavrommatis.recipe.domain.Category;
import gr.gmavrommatis.recipe.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * CategoryRepository interface created 16-Aug-21
 *
 * @author G.MAVROMMATIS
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
