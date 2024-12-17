package model;

import java.util.List;

public class Module {
    private String code;
    private String nom;

    public Module(String code, String nom, Filiere filiere, String semestre, List<ElementModule> elementsModules) {
        this.code = code;
        this.nom = nom;
        this.filiere = filiere;
        this.semestre = semestre;
        this.elementsModules = elementsModules;
    }

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

    public Filiere getFiliere() {
        return filiere;
    }

    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public List<ElementModule> getElementsModules() {
        return elementsModules;
    }

    public void setElementsModules(List<ElementModule> elementsModules) {
        this.elementsModules = elementsModules;
    }

    private Filiere filiere;
    private String semestre; // S1, S2, S3, S4, S5
    private List<ElementModule> elementsModules;

    // Constructeurs, getters et setters
}