package com.samy.AriMayi_facture.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class LigneFacture {
    @Id //Clé primaire identifiant la ligne facture
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ligneFactureId;    
    @ManyToOne //Clé étrangère de la facture
    @JoinColumn(name="facture_id")
    private Facture facture;
    private String description;
    private long quantite;
    private double prixUnitaireHT;
    private double tauxTVA;
    
    public LigneFacture() {} //Constructeur vide pour JPA
    
    public LigneFacture(String description, long quantite, long prixUnitaireHT, double tauxTVA) {
        this.description = description;
        this.quantite = quantite;
        this.prixUnitaireHT = prixUnitaireHT;
        this.tauxTVA = tauxTVA;
    }

    //GETTERS
    public long getLigneFactureId() {
        return ligneFactureId;
    }

    public Facture getFacture() {
        return facture;
    }

    public String getDescription() {
        return description;
    }
    public long getQuantite() {
        return quantite;
    }
    public double getPrixUnitaireHT() {
        return prixUnitaireHT;
    }
    public double getTauxTVA() {
        return tauxTVA;
    }

    //SETTERS
    public void setFacture(Facture newFacture) {
        facture = newFacture;
    }

    public void setDescription(String newDescription) {
        description = newDescription;
    }
    public void setQuantite(long newQuantite) {
        quantite = newQuantite;
    }
    public void setPrixUnitaireHT(double newPrixUnitaireHT) {
        prixUnitaireHT = newPrixUnitaireHT;
    }
    public void setTauxTVA(double newTauxTVA) {
        tauxTVA = newTauxTVA;
    }
}