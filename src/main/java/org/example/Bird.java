package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Bird extends Animal{
    public Bird(String species) {
        super(species);
    }
}
