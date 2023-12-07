package guru.springframework.recipeapp.domain;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {
    Category category;

   @BeforeEach
    public void setUp(){
        category = new Category();
    }

    @Test
    public void getId() {
        Long idValue = 4L;
        category.setId(idValue);
        assertEquals(idValue, category.getId());
    }


    @Test
    void getDescription() {
    }

    @Test
    void getRecipes() {
    }
}