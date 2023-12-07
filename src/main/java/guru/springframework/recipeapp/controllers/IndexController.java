package guru.springframework.recipeapp.controllers;

import guru.springframework.recipeapp.domain.UnitOfMeasure;
import guru.springframework.recipeapp.domain.Category;
import guru.springframework.recipeapp.repositories.CategoryRepository;
import guru.springframework.recipeapp.repositories.UnitOfMeasureRepository;
import guru.springframework.recipeapp.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Slf4j
@Controller

public class IndexController {
//
//    private CategoryRepository categoryRepository;
//    private UnitOfMeasureRepository unitOfMeasureRepository;

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }


//    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository, RecipeService recipeService) {
//        this.categoryRepository = categoryRepository;
//        this.unitOfMeasureRepository = unitOfMeasureRepository;
//        this.recipeService = recipeService;
//    }
    @RequestMapping({"", "/", "/index"})
    public String getIndex(Model model) {
        log.debug("Getting Index page");

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
//        log.debug("Getting Index Page");
//
//        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
//        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");
//
//        System.out.println("Cat Id is: " + categoryOptional.get().getId());
//        System.out.println("UOM ID is: " + unitOfMeasureOptional.get().getId());
//
//
//        return "index";

    }

}
