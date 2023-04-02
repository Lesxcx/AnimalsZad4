package org.example;

import java.util.ArrayList;
import java.util.List;

public class Enclosure<T extends Animal> {
    private final List<T> enclosure = new ArrayList<>();

    public void addAnimalToEnclosure(T t){
        enclosure.add(t);
    }

    public void deleteAnimalFromEnclosure(T t){
        enclosure.remove(t);
    }

    public void checkHowManyAnimals(){
        this.enclosure.size();
    }
}
