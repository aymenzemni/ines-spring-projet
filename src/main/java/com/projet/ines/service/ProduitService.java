package com.projet.ines.service;

import com.projet.ines.model.ProduitModel;
import com.projet.ines.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitService {

    @Autowired
    ProduitRepository produitRepository;

    public List<ProduitModel> getAllProduits() {
        return produitRepository.findAll();
    }
    public String addNewProduit(ProduitModel produitModel) {
        try {
            produitRepository.save(produitModel);
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }

    public String updateProduit(ProduitModel produitModel) {
        if (produitRepository.existsById(produitModel.getId())) {
            produitRepository.save(produitModel);
            return "Produit mis à jour avec succès.";
        } else {
            return "Produit non trouvé. Impossible de mettre à jour.";
        }
    }

    public String deleteProduit(ProduitModel produitModel) {
        if (produitRepository.existsById(produitModel.getId())) {
            produitRepository.delete(produitModel);
            return "Produit supprimé avec succès.";
        } else {
            return "Produit non trouvé. Impossible de supprimer.";
        }
    }
}
