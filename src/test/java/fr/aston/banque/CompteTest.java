package fr.aston.banque;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompteTest {

    @Test
    void setNumero() {
    }

    @Test
    void getNumero() {
    }

    @Test
    void getSolde() {
    }

    @Test
    void setSolde() {
    }

    @Test
    @DisplayName("retirer doit retirer le montant indiqué")
    void retirer() {
        Compte compte = new Compte(90,100);
        compte.retirer(10);
        assertEquals(90, compte.getSolde(), "retirer 10€ au solde (100€) doit donner 90€");
    }

    @Test
    @DisplayName("ajouter doit ajouter le montant indiqué")
    void ajouter() {
        Compte compte = new Compte(100,100);
        compte.ajouter(10);
        assertEquals(110, compte.getSolde(), "ajouter 10€ au solde (100€) doit donner 110€");
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
}