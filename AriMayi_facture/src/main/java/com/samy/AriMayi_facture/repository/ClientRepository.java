package com.samy.AriMayi_facture.repository;

import java.util.List; 
import com.samy.AriMayi_facture.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

    List<Client> findByNom(String name);
    
}