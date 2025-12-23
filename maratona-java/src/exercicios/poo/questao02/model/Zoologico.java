package exercicios.poo.questao02.model;

public class Zoologico {
    private Animal[] animais;

    public Zoologico(Animal[] animais) {
        this.animais = animais;
    }

    public Animal[] getAnimais() {
        return this.animais;
    }
}
