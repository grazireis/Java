package Dados;

import java.util.ArrayList;
import java.util.List;

public class ZooManager {
     private final List<Animal> animais;

    public ZooManager() {
        this.animais = new ArrayList<>();
    }

    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
        System.out.println(animal.getNome() + " foi adicionado ao zoológico.");
    }

    public void listarAnimais() {
        if (animais.isEmpty()) {
            System.out.println("Não há animais registrados no zoológico.");
        } else {
            System.out.println("Animais registrados:");
            for (Animal animal : animais) {
                System.out.println(animal.getNome() + " (" + "- " + animal.getClass().getSimpleName() + ")");
            }
        }
    }

    public void emitirSons() {
        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}

