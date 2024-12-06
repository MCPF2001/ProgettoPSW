package com.progettopswcp.ProgettoPSW;

import jakarta.persistence.*;

@Entity
@Table(name = "prodotto")
public class Prodotto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdProdotto", nullable = false)
    private int IdProdotto;

    @Basic
    @Column(name = "Prezzo", nullable = true)
    private float Prezzo;


    @Basic
    @Column(name = "NomeProdotto", nullable = true)
    private String NomeProdotto;


    @Basic
    @Column(name = "tipoprodotto", nullable = true)
    private String tipoprodotto;
}




