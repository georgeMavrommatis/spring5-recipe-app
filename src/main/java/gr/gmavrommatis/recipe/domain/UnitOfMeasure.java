package gr.gmavrommatis.recipe.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * UnitOfMesure class created 16-Aug-21
 *
 * @author G.MAVROMMATIS
 */
@Getter
@Setter
@Entity
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String description;

}
