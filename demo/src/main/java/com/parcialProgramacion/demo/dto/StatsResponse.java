package com.parcialProgramacion.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class StatsResponse {

    @JsonProperty("count_mutant_dna")
    private long countMutantDna;

    @JsonProperty("count_human_dna")
    private long countHumanDna;

    // Campo que representa la proporción de ADN mutante frente al ADN humano
    private double ratio;
}
