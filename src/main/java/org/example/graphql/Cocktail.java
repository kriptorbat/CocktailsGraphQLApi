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

    @Column(columnDefinition = "json")
    private String ingredients;

    @Column(columnDefinition = "json")
    private String steps;

    @Column(columnDefinition = "json")
    private String tags;

    @Column(columnDefinition = "json")
    private String tools;
}
