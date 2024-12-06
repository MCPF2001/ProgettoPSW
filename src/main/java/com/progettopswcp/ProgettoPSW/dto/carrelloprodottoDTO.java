package com.progettopswcp.ProgettoPSW.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class carrelloDTO {
    private int idCarrello;
    private int idUtente;
    private int quantita;
    private String data;
    private float totalecarrello;
}