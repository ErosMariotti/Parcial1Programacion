package com.parcialProgramacion.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ParcialProgramaciomApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParcialProgramaciomApplication.class, args);
	}

	// Las siguintes pruebas unitarios fueron movidas a Test!

		/*SpringApplication.run(ParcialProgramaciomApplication.class, args);

		MutantService mutant = new MutantService();

		// Caso 1: "AAAA", "CCCC", "TCAG", "GGTC" -> Mutante = true
		String[] caso1 = {"AAAA", "CCCC", "TCAG", "GGTC"};
		probarMutante(mutant, caso1);

		// Caso 2: "AAAT", "AACC", "AAAC", "CGGG" -> Mutante = false
		String[] caso2 = {"AAAT", "AACC", "AAAC", "CGGG"};
		probarMutante(mutant, caso2);

		// Caso 3: "TGAC", "AGCC", "TGAC", "GGTC" -> Mutante = true
		String[] caso3 = {"TGAC", "AGCC", "TGAC", "GGTC"};
		probarMutante(mutant, caso3);

		// Caso 4: "AAAA", "AAAA", "AAAA", "AAAA" -> Mutante = false
		String[] caso4 = {"AAAA", "AAAA", "AAAA", "AAAA"};
		probarMutante(mutant, caso4);

		// Caso 5: "TGAC", "ATCC", "TAAG", "GGTC" -> Mutante = false
		String[] caso5 = {"TGAC", "ATCC", "TAAG", "GGTC"};
		probarMutante(mutant, caso5);

		// Caso 6 (mutante):
		String[] caso6 = {
				"TCGGGTGAT",
				"TGATCCTTT",
				"TACGAGTGA",
				"AAATGTACG",
				"ACGAGTGCT",
				"AGACACTGG",
				"GAATTCCAA",
				"ACTACGCCA",
				"TGAGTACCC"
		};
		probarMutante(mutant, caso6);

		// Caso 7 (mutante):
		String[] caso7 = {
				"TTTTTTTTT",
				"TTTTTTTTT",
				"TTTTTTTTT",
				"TTTTTTTTT",
				"CCGACCGTA",
				"GGCACCCAA",
				"AGGAACCTA",
				"CAAAGGCAT",
				"GCGTCCCCA"
		};
		probarMutante(mutant, caso7);
	}

	public static void probarMutante(MutantService detector, String[] dna) {
		try {
			boolean isMutant = detector.isMutant(dna);
			System.out.println("Secuencia ADN: " + Arrays.toString(dna));
			System.out.println("Es mutante: " + isMutant);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}


		// Prueba manual: Casos mutantes
		String[] mutantDna = {"AAAA", "CCCC", "TCAG", "GGTC"};
		try {
			boolean isMutant = mutantDetector.isMutant(mutantDna);
			System.out.println("Es mutante: " + isMutant);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

		// Prueba manual: Casos no mutantes
		String[] noMutantDna = {"AAAT", "AACC", "AAAC", "CGGG"};
		try {
			boolean isMutant = mutantDetector.isMutant(noMutantDna);
			System.out.println("Es mutante: " + isMutant);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

		String[] emptyDna = {};
		try {
			boolean isMutant = mutantDetector.isMutant(emptyDna);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

		// Manejo de errores: Array no cuadrado (NxM)
		String[] nonSquareDna = {"ATGC", "CAGT", "TTATG"};
		try {
			boolean isMutant = mutantDetector.isMutant(nonSquareDna);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

		// Manejo de errores: Array con números como strings
		String[] numericDna = {"1234", "5678", "9101", "1121"};
		try {
			boolean isMutant = mutantDetector.isMutant(numericDna);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}


		// Manejo de errores: Array null
		String[] nullDna = null;
		try {
			boolean isMutant = mutantDetector.isMutant(nullDna);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}


		// Manejo de errores: Array cuadrado con todos los elementos null
		String[] allNullDna = {null, null, null, null};
		try {
			boolean isMutant = mutantDetector.isMutant(allNullDna);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}


		// Manejo de errores: Array cuadrado con letras no permitidas
		String[] invalidLettersDna = {"ATGB", "CAGH", "TTAA", "GGTC"};
		try {
			boolean isMutant = mutantDetector.isMutant(invalidLettersDna);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		} */
}


