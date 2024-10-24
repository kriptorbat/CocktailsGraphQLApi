package org.example.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CocktailQuery implements GraphQLQueryResolver {
    private final CocktailRepository cocktailRepository;

    public CocktailQuery(CocktailRepository cocktailRepository) {
        this.cocktailRepository = cocktailRepository;
    }

    public List<Cocktail> getAllCocktails() {
        return cocktailRepository.findAll();
    }

    public Cocktail getCocktailById(Long id) {
        return cocktailRepository.findById(id).orElse(null);
    }

    public List<Cocktail> searchCocktailsByTag(String tag) {
        return cocktailRepository.findByTagsContaining(tag);
    }
}
