package com.samy.AriMayi_facture.repository;

import java.util.List;
import com.samy.AriMayi_facture.model.LigneFacture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LigneFactureRepository extends JpaRepository<LigneFacture, Long> {
    List<LigneFacture> findByQuantite(long quantite);
}