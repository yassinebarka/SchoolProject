package model;


public class Utilisateur {
    private String login;
    private String motDePasse;
    private String profil; // admin ou professeur
    private Professeur professeur; // optionnel, null pour admin

    public Utilisateur(String login, String motDePasse, String profil, Professeur professeur) {
        this.login = login;
        this.motDePasse = motDePasse;
        this.profil = profil;
        this.professeur = professeur;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getProfil() {
        return profil;
    }

    public void setProfil(String profil) {
        this.profil = profil;
    }

    public Professeur getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }
// Constructeurs, getters et setters
}
