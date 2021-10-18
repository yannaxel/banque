package fr.aston.banque;

import fr.aston.banque.Client;
import fr.aston.banque.Compte;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BanqueTest {

    private Compte initCompte;
    private Client initClient;

    //    ----------------------------------------------------------------

    @BeforeEach
    void setUp(){
        this.initCompte = new Compte();
        this.initClient = new Client();
    }

    //    ----------------------------------------------------------------

    @Test
    @DisplayName("addition doit fonctionner")
    void testAjouterMontant() {
        Compte compte = new Compte(100,100);
        compte.ajouter(10);
        assertEquals(110, compte.getSolde(), "addition de 100€ et 10€ doit donner 110€");
    }

    @Test
    @DisplayName("un numero de compte doit etre positif")
    void isNumeroComptePositif(){
        Compte compte = new Compte(600,0.5);
        assertTrue(compte.getNumero() > 0, "Le numéro de compte doit etre positif");
    }

    @Test
    @DisplayName("un numero de compte doit etre unique")
    void numeroCompteUnique(){
        Compte compte1 = new Compte(101,500);
        Compte compte2 = new Compte(102,250);
        assertNotEquals(compte1.getNumero(),compte2.getNumero());
    }

    @Test
    @DisplayName("parce que chaque client est unique")
    void clientUnique(){
        Client client1 = new Client("Payepasdemine","Maurice",62,2156);
        Client client2 = new Client("Payepasdemine","Maurice",56,2000);
        // duplication
//        Client client2 = client1;
        assertNotSame(client1, client2, "les clients doivent etre différents");
    }

    @Test
    void testGroupe(){
        Compte monCompte=new Compte(512332,5000000.00);
        assertAll("informations du compte conformes",
                ()->{assertTrue(monCompte.getNumero()==512332,"Le numero de compte doit etre 512332");},
                ()->{assertTrue(monCompte.getSolde()==5000000.00,"Le solde doit etre de 5000000€");
                });
    }

    @Test
    void checkLists(){

        Client client1 = new Client("YATCH", "Muriel", 60, 213);
        Client client2 = new Client("YATCH", "Muriel", 26, 125485);

        java.util.List<String> liste = Arrays.asList(client1.getPrenom(),client1.getNom());
        java.util.List<String> liste2 = Arrays.asList(client2.getPrenom(),client2.getNom());
        List<String> liste3 = Arrays.asList("\\b[A-Z][A-Za-z]*\\b","\\b[A-Z][A-Za-z]*\\b");

        assertAll("Les listes doivent correspondre", () -> {
                    assertLinesMatch(liste, liste2, "les listes ne correspondent pas");
                }, () -> {
                    assertLinesMatch(liste3,liste,"les listes ne contiennent pas exclusivement des lettres");
                }
        );

    }

    //    ----------------------------------------------------------------

}
