package com.parcialProgramacion.demo.repositories;

import com.parcialProgramacion.demo.entities.Dna;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MutantRepository extends JpaRepository<Dna, Long>{

    // Metodo personalizado para buscar una secuencia de ADN específica
    Optional<Dna> findByDna(String dnaSequence);

    // Metodo personalizado para contar cuántos ADN son mutantes
    long countByIsMutant(boolean isMutant);
}
