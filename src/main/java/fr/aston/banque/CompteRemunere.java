package fr.aston.banque;

public class CompteRemunere extends Compte implements ICompteRemunere {
    private double taux;

    public CompteRemunere(){
    }

    public CompteRemunere(int numero, double solde, double taux) {
        super(numero, solde);
        this.taux = taux;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        if (taux>=0.0 && taux<=1.0){
            this.taux = taux;
        }
    }

    @Override
    public String toString() {
        return "CompteRemunere{" + super.toString() +
                "taux=" + taux +
                '}';
    }

    public double calculerInterets(){
        return taux*this.getSolde();
    }

    public void verserInterets(){
        this.setSolde(this.getSolde()+calculerInterets());
    }
}
