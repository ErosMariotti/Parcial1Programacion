package com.parcialProgramacion.demo.entities;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Dna implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id; // clave primaria Long

    private String dna; // Campo que almacena la secuencia de ADN
    private boolean isMutant; // Campo que indica si la secuencia de ADN es mutante o no
}
