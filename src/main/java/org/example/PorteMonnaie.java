package org.example;

import java.util.ArrayList;
import java.util.List;

public class PorteMonnaie {
    private List<SommeArgent> contenu = new ArrayList<>();
    public void ajouterSomme(SommeArgent somme) {
        contenu.add(somme);
    }
    public int montantTotalPourDevise(String devise) {
        return contenu.stream()
                .filter(somme -> somme.getDevise().equals(devise))
                .mapToInt(SommeArgent::getMontant)
                .sum();
    }
    public List<SommeArgent> getContenu() {
        return contenu;
    }
}
