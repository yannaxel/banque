package fr.aston.banque;

public interface ICompte {
    int getNumero();

    double getSolde();

    void setSolde(double solde);

    @Override
    String toString();

    void ajouter(double unMontant);

    void retirer(double unMontant);
}
