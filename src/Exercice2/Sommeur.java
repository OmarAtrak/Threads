package Exercice2;

import java.util.List;

public class Sommeur implements Runnable {
    private List<Number> numbers;
    private int debut;
    private int fin;
    private int somme;


    public Sommeur(List<Number> numbers, int debut, int fin) {
        this.numbers = numbers;
        this.debut = debut;
        this.fin = fin;
    }

    public void getSomme() {
        for (int i = 0; i < this.numbers.size(); i++) {
            if (i >= this.debut && i <= this.fin) {
                this.somme += (int)(this.numbers.get(i));
            }
        }
    }

    @Override
    public void run() {
        System.out.println(this.somme);
    }
}
