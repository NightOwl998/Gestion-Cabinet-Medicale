package sample;

import java.util.Date;

public class Patient {
    private String nom ;
    private String prenom;
    private String adresse;
    private String telephone;
    private String mail;
    private Date dateDeNaissance;


    public Patient(String nom, String prenom, String adresse, String telephone, String mail, Date datDeNaissance, String adresse1, String telephone1, String mail1, Date dateDeNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse1;
        this.telephone = telephone1;
        this.mail = mail1;
        this.dateDeNaissance = dateDeNaissance;
    }

}
