package gr.gmavrommatis.recipe.services;

import gr.gmavrommatis.recipe.domain.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * RecipeService class created 17-Aug-21
 *
 * @author G.MAVROMMATIS
 */
public interface RecipeService {

    Set<Recipe> getRecipes();
}
