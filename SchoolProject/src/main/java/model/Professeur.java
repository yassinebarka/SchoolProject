package model;

import java.util.List;
import java.util.Date;

public class Professeur {
    private String code;
    private String nom;
    private String prenom;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public List<ElementModule> getElementsModules() {
        return elementsModules;
    }

    public void setElementsModules(List<ElementModule> elementsModules) {
        this.elementsModules = elementsModules;
    }

    public Utilisateur getCompte() {
        return compte;
    }

    public void setCompte(Utilisateur compte) {
        this.compte = compte;
    }

    private String specialite;
    private List<ElementModule> elementsModules;
    private Utilisateur compte;

    public Professeur(String code, String nom, String prenom, String specialite, List<ElementModule> elementsModules, Utilisateur compte) {
        this.code = code;
        this.nom = nom;
        this.prenom = prenom;
        this.specialite = specialite;
        this.elementsModules = elementsModules;
        this.compte = compte;
    }



    // Constructeurs, getters et setters
}