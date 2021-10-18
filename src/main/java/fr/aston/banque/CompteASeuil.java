package fr.aston.banque;

public class CompteASeuil extends Compte implements ICompteASeuil {
    private double seuil;

    public CompteASeuil() {
    }

    public CompteASeuil(int numero, double solde, double seuil) {
        super(numero, solde);
        this.seuil = seuil;
    }

    public double getSeuil() {
        return seuil;
    }

    public void setSeuil(double seuil) {
        this.seuil = seuil;
    }

    @Override
    public String toString() {
        return "CompteASeuil{" + super.toString() +
                "seuil=" + seuil +
                '}';
    }

    @Override
    public void retirer(double uneValeur) {
        if (this.getSolde() - uneValeur > this.seuil) {
            this.setSolde(this.getSolde() - uneValeur);
        }
        else {
            throw new BanqueException("Vous voulez retirer plus qu'autorisé");
        }
    }
}


