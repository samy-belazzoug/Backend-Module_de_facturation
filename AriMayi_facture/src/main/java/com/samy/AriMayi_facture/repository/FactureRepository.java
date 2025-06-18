package com.samy.AriMayi_facture.repository;

import java.time.LocalDateTime;
import java.util.List;
import com.samy.AriMayi_facture.model.Facture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FactureRepository extends JpaRepository<Facture, Long> {
    List<Facture> findByDate(LocalDateTime date);
}
