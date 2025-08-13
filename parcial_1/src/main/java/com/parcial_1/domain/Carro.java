package com.parcial_1.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "carro")
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCarro;
    private String descripcion;
    private int cilindros;
    private String fechaLiberacion;
    private String imagen;
}