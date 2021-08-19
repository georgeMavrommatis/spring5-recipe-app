package gr.gmavrommatis.recipe.controllers;

import gr.gmavrommatis.recipe.services.RecipeServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * IndexController class created 11-Aug-21
 *
 * @author G.MAVROMMATIS
 */
@Slf4j
@Controller
public class IndexController {

    private RecipeServiceImpl recipeService;

    public IndexController(RecipeServiceImpl recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model){

        log.debug("Getting Index Page");

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
