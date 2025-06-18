package com.samy.AriMayi_facture.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Facture {
    @Id //Clé primaire factureId
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long factureId;
    @ManyToOne //Clé étrangère client
    @JoinColumn(name="client_id") 
    private Client client;
    private LocalDateTime date = LocalDateTime.now();
    public Facture() { } //Constructeur vide pour JPA
    
    //GETTERS
    public long getFactureId() {
        return factureId;
    }
    public LocalDateTime getDate() {
        return date;
    }
    public Client getClient() {
        return client;
    }

    //SETTERS
    public void setClient(Client newClient) {
        client = newClient;
    }

}
