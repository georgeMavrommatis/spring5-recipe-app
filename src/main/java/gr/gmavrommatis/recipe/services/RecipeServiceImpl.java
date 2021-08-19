package gr.gmavrommatis.recipe.services;

import gr.gmavrommatis.recipe.domain.Recipe;
import gr.gmavrommatis.recipe.repositories.RecipeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * RecipeServiceImpl class created 17-Aug-21
 *
 * @author G.MAVROMMATIS
 */
@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService {
    private RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {

        Set<Recipe> recipes = new HashSet<>();
        log.debug("I'm in the service");
        recipeRepository.findAll().iterator().forEachRemaining(recipes::add);

        return recipes;
    }
}
