package org.example.graphql;

import lombok.Data;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Cocktail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name = "image_url")
    private String imageUrl;
    private String uuid;
    @ElementCollection
    @Column(columnDefinition = "json")
    private List<String> ingredients = new ArrayList<>();
    @ElementCollection
    @Column(columnDefinition = "json")
    private List<String> steps = new ArrayList<>();
    @ElementCollection
    @Column(columnDefinition = "json")
    private List<String> tags = new ArrayList<>();
    @ElementCollection
    @Column(columnDefinition = "json")
    private List<String> tools = new ArrayList<>();
}
