package com.samy.AriMayi_facture.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Client {
    @Id //Clé primaire pour identifier le client
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;
    private String email;
    private String siret;
    private LocalDateTime date_de_creation = LocalDateTime.now();
    
    public Client() {} //Constructeur vide pour JPA
    
    public Client(String nom, String email, String siret) {
        this.nom = nom;
        this.email = email;
        this.siret = siret;
        this.date_de_creation = LocalDateTime.now();
    }
    //GETTERS
    public long getId() {
        return this.id;
    }

    public String getNom() {
        return this.nom;
    }
    public String getEmail() {
        return this.email;
    }
    public String getSiret() {
        return this.siret;
    }
    public LocalDateTime getDatedeCreation() {
        return this.date_de_creation;
    }

    //SETTERS
    public void setNom(String newNom) {
        this.nom = newNom;
    }
    public void setEmail(String newEmail) {
        this.email = newEmail;
    }
    public void setSiret(String newSiret) {
        this.siret = newSiret;
    }
}