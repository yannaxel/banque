package fr.aston.banque;

import javax.management.Query;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {
    private String nom;
    private String prenom;
    private int age;
    private int numero;
    // private Compte[] comptes = new Compte[5];
    private List<Compte> comptes = new ArrayList<>();
    // private final Set<Compte> comptes = new HashSet<>();

    public Client() {
        this("","",0,0);
    }

    public Client(String nom, String prenom, int age, int numero) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Compte[] getComptes() {
        // Compte[] convertedComptes = (Compte[]) this.comptes;
        return this.comptes.toArray(new Compte[0]);
    }

    public void setComptes(Compte[] lesComptes) {
        this.comptes = Arrays.asList(lesComptes);
    }

    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", numero=" + numero +
                //", comptes=" + comptes +
                '}';
    }

    /**
     * Documenatation de la fonction ajouterCompte !
     */
    public void ajouterCompte(Compte nouveauCompte){
        int indice = 0;
        for (Compte compte: this.comptes){
            if (compte ==null) {
                // this.comptes[indice] = nouveauCompte;
                this.comptes.add(nouveauCompte);
                break;
            }
            indice++;
        }
        if (indice==5){
            throw new BanqueException("Vous ne pouvez plus ajouter de nouveaux comptes");
        }

    }

    public Compte getCompte(int numeroCompte){
        for (Compte elem: comptes){
            if (elem.getNumero() == numeroCompte){
                return elem;
            }
        }
        System.out.println("N'a pas trouvé de compte à ce numéro");
        return new Compte(0);
    }

}
