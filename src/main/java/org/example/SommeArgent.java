package org.example;

public class SommeArgent {
    private int montant;
    private String devise;
    public SommeArgent(int montant, String devise) {
        this.montant = montant;
        this.devise = devise;
    }
    public int getMontant() {
        return montant;
    }
    public String getDevise() {
        return devise;
    }
    public SommeArgent additionner(SommeArgent autre) {
        if (!this.devise.equals(autre.devise)) {
            throw new IllegalArgumentException("Les devises sont différentes");
        }
        return new SommeArgent(this.montant + autre.montant,
                this.devise);
    }
    public boolean equals(Object obj) {
        if (!(obj instanceof SommeArgent)) return false;
        SommeArgent autre = (SommeArgent) obj;
        return this.montant == autre.montant &&
                this.devise.equals(autre.devise);
    }
    @Override
    public String toString() {
        return montant + " " + devise;
    }
}