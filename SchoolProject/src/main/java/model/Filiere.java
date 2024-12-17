package model;

import java.util.List;

public class Filiere {
    private String code;

    public Filiere(String code, String nom, List<Module> modules) {
        this.code = code;
        this.nom = nom;
        this.modules = modules;
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

    public List<Module> getModules() {
        return modules;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }

    private String nom;
    private List<Module> modules;

    // Constructeurs, getters et setters
}