package gr.gmavrommatis.recipe.repositories;

import gr.gmavrommatis.recipe.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * RecipeRepository interface created 16-Aug-21
 *
 * @author G.MAVROMMATIS
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
