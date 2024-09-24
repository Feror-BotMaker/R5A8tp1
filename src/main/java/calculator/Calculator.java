package calculator;

import java.util.HashSet;
import java.util.Set;

public class Calculator {
    public static int add(int opG, int opD) {
        if ((opD > 0 && opG > Integer.MAX_VALUE - opD) ||
                (opD < 0 && opG < Integer.MIN_VALUE - opD)) {
            throw new ArithmeticException("Débordement lors de l'addition");
        }

        return opG + opD;
    }

    public static int divide(int opG, int opD) {
        if (opD == 0) {
            throw new ArithmeticException("Division par zéro interdite");
        }
        return opG / opD;
    }

    public static Set<Integer> ensembleChiffres(int pNombre) {
        Set<Integer> chiffres = new HashSet<>();
        pNombre = Math.abs(pNombre); // Prendre la valeur absolue du nombre pour ignorer les signes négatifs

        // Si le nombre est 0, ajouter simplement 0 à l'ensemble
        if (pNombre == 0) {
            chiffres.add(0);
        }

        // Extraire chaque chiffre du nombre et l'ajouter à l'ensemble
        while (pNombre > 0) {
            chiffres.add(pNombre % 10);
            pNombre /= 10;
        }

        return chiffres;
    }
}
