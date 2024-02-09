package com.projet.ines.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "PRODUIT")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProduitModel implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NOM")
    private String nomproduit;
    @Column(name = "PRIX")
    private String prixproduit;
    @Column(name = "QUANTITE")
    private String qtproduit;
    @Column(name = "DESCRIPTION")
    private String description;

}
