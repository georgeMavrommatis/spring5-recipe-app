package gr.gmavrommatis.recipe.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CategoryTest {

    Category category;

    @Before
    public void setUp(){
        /*We will create an new category object before any @Test*/
        category = new Category();
    }

    @Test
    public void getId() {
        Long idValue = 4L;

        category.setId( idValue );

        assertEquals( idValue, category.getId());
    }

    @Test
    public void getDescription() {
    }

    @Test
    public void getRecipes() {
    }
}