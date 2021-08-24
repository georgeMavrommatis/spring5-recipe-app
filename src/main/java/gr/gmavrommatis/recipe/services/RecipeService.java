package gr.gmavrommatis.recipe.services;

import gr.gmavrommatis.recipe.commands.RecipeCommand;
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

    Recipe findById(Long l);

    RecipeCommand findCommandById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    void deleteById(Long idToDelete);
}
