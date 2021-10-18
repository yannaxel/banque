package fr.aston.banque;

public class Compte implements ICompte {
    private int numero = 0;
    private double solde = 0.0;

    public Compte() {this(0, 0);}

    public Compte(int numero) {
        this(numero, 0);
    }

    public Compte(int numero, double solde) {
        this.numero = numero;
        this.solde = solde;
    }

    @Override
    public int getNumero() {
        return numero;
    }

    @Override
    public double getSolde() {
        return solde;
    }

    @Override
    public void setSolde(double solde) {
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "numero=" + numero +
                ", solde=" + solde +
                '}';
    }

    @Override
    public void ajouter(double unMontant){
        this.solde+=unMontant;
    }

    @Override
    public void retirer(double unMontant){
        this.solde-=unMontant;
    }


}
