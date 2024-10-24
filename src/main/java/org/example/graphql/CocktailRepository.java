package org.example.graphql;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CocktailRepository extends JpaRepository<Cocktail, Long> {
    List<Cocktail> findByTagsContaining(String tag);
}
