package gr.gmavrommatis.recipe.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

/**
 * Category class created 16-Aug-21
 *
 * @author G.MAVROMMATIS
 */
@Getter
@Setter
@EqualsAndHashCode(exclude = {"recipes"})
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;

}
