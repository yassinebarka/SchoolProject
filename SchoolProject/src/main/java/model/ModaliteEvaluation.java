package model;

import java.util.List;

public class ModaliteEvaluation {
    private String type; // CC, TP, Projet, Présentation
    private double coefficient; // Par exemple 0.3 pour 30%
    private ElementModule elementModule;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    public ElementModule getElementModule() {
        return elementModule;
    }

    public void setElementModule(ElementModule elementModule) {
        this.elementModule = elementModule;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    public ModaliteEvaluation(String type, double coefficient, ElementModule elementModule, List<Note> notes) {
        this.type = type;
        this.coefficient = coefficient;
        this.elementModule = elementModule;
        this.notes = notes;
    }

    private List<Note> notes;

    // Constructeurs, getters et setters
}