package model;

import java.util.List;

public class ElementModule {
    private String code;
    private String nom;
    private Module module;

    public String getCode() {
        return code;
    }

    public ElementModule(String code, String nom, Module module, double coefficient, List<ModaliteEvaluation> modalitesEvaluation, Professeur professeur, List<Filiere> filieres) {
        this.code = code;
        this.nom = nom;
        this.module = module;
        this.coefficient = coefficient;
        this.modalitesEvaluation = modalitesEvaluation;
        this.professeur = professeur;
        this.filieres = filieres;
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

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    public List<ModaliteEvaluation> getModalitesEvaluation() {
        return modalitesEvaluation;
    }

    public void setModalitesEvaluation(List<ModaliteEvaluation> modalitesEvaluation) {
        this.modalitesEvaluation = modalitesEvaluation;
    }

    public Professeur getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }

    public List<Filiere> getFilieres() {
        return filieres;
    }

    public void setFilieres(List<Filiere> filieres) {
        this.filieres = filieres;
    }

    private double coefficient; // Par exemple 0.5 pour 50%
    private List<ModaliteEvaluation> modalitesEvaluation;
    private Professeur professeur;
    private List<Filiere> filieres;

    // Constructeurs, getters et setters
}