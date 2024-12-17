package model;

import java.util.Date;

public class Note {
    private Utilisateur etudiant;
    private ModaliteEvaluation modalite;
    private double valeur;

    public Utilisateur getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Utilisateur etudiant) {
        this.etudiant = etudiant;
    }

    public ModaliteEvaluation getModalite() {
        return modalite;
    }

    public void setModalite(ModaliteEvaluation modalite) {
        this.modalite = modalite;
    }

    public double getValeur() {
        return valeur;
    }

    public void setValeur(double valeur) {
        this.valeur = valeur;
    }

    public Date getDateEvaluation() {
        return dateEvaluation;
    }

    public void setDateEvaluation(Date dateEvaluation) {
        this.dateEvaluation = dateEvaluation;
    }

    private Date dateEvaluation;

    public Note(Utilisateur etudiant, ModaliteEvaluation modalite, double valeur, Date dateEvaluation) {
        this.etudiant = etudiant;
        this.modalite = modalite;
        this.valeur = valeur;
        this.dateEvaluation = dateEvaluation;
    }
// Constructeurs, getters et setters
}