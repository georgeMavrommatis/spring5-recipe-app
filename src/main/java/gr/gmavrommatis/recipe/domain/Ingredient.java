package gr.gmavrommatis.recipe.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.annotation.processing.Generated;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Ingredient class created 16-Aug-21
 *
 * @author G.MAVROMMATIS
 */
@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private BigDecimal amount;

    @OneToOne(fetch = FetchType.EAGER)
    private UnitOfMeasure uom;

    @ManyToOne
    private Recipe recipe;

    public Ingredient(){

    }

    public Ingredient(String description, BigDecimal amount, UnitOfMeasure uom) {
        this.description = description;
        this.amount = amount;
        this.uom = uom;
    }
}
