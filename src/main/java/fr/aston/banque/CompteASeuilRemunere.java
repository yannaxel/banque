package fr.aston.banque;

public class CompteASeuilRemunere extends CompteRemunere implements ICompteASeuil {
    private double seuil;

    public CompteASeuilRemunere(int numero, double solde, double taux, double seuil) {
        super(numero, solde, taux);
        this.seuil = seuil;
    }

    @Override
    public double getSeuil() {
        return seuil;
    }

    @Override
    public void setSeuil(double seuil) {
        this.seuil = seuil;
    }

    @Override
    public void retirer(double uneValeur) {
        if (this.getSolde() - uneValeur > this.seuil){
            this.setSolde(this.getSolde() - uneValeur);
        }
        else {
            throw new BanqueException("Vous voulez retirer plus qu'autorisé");
        }
    }

    @Override
    public String toString() {
        return "CompteASeuilRemunere{" + super.toString() +
                "seuil=" + seuil +
                '}';
    }
}
