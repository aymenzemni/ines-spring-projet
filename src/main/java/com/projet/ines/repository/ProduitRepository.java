package com.projet.ines.repository;

import com.projet.ines.model.ProduitModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<ProduitModel, ProduitModel> {
    boolean existsById(Integer id);
}
