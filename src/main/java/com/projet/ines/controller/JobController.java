package com.projet.ines.controller;


import com.projet.ines.model.ProduitModel;
import com.projet.ines.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/jobs")
public class JobController {

    @Autowired
    ProduitService produitService;

    @GetMapping("/findAll")
    public List<ProduitModel> returnAllProduits() {
        return produitService.getAllProduits();
    }

    @PostMapping("/addNew")
    public String addNewProduit(@RequestBody ProduitModel produitModel) {
        return produitService.addNewProduit(produitModel);
    }

    @PutMapping("/update")
    public String updateProduit(@RequestBody ProduitModel produitModel) {
        return produitService.updateProduit(produitModel);
    }

    @PostMapping("/delete")
    public String deleteProduit(@RequestBody ProduitModel produitModel) {
        return produitService.deleteProduit(produitModel);
    }

}


