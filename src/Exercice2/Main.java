package Exercice2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Number> nombers = new ArrayList<>();
        nombers.add(10);
        nombers.add(5);
        nombers.add(21);
        nombers.add(7);
        nombers.add(32);

        for (int i = 1; i < 5; i++) {
            Thread thread = new Thread(new Sommeur(nombers, 0,i));
            thread.start();
        }

    }
}
