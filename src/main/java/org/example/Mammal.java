package org.example;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Mammal extends Animal{
    public Mammal(String species) {
        super(species);
    }
}
