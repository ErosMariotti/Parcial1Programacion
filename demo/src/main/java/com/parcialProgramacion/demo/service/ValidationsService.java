package com.parcialProgramacion.demo.service;

import org.springframework.stereotype.Service;

@Service
public class ValidationsService {

    // Valida que el array no sea nulo ni esté vacío
    static void validarArrayNoVacio(String[] array) throws Exception {
        if (array == null || array.length == 0) {
            throw new Exception("El array es null o está vacío.");
        }
    }

    // Procesa el array y lanza una excepción si está vacío
    static void procesarArray(String[] array) throws Exception {
        if (array.length == 0) {
            throw new Exception("El array está vacío.");
        }
    }

    // Valida que el array sea cuadrado (todas las filas deben tener la misma longitud que el número de filas)
    static void validarArray(String[] array) throws Exception {
        int n = array.length;
        if (n == 0) {
            throw new Exception("El array está vacío.");
        }
        for (String row : array) {
            if (row.length() != n) {
                throw new Exception("El array no es cuadrado. Longitud esperada: " + n + ", encontrada: " + row.length());
            }
        }
    }

    // Valida que el contenido del array solo contenga caracteres válidos ('A', 'T', 'C', 'G')
    static void validarContenido(String[] array) throws Exception {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            String row = array[i];
            if (row == null) {
                throw new Exception("La fila " + i + " es null.");
            }
            for (int j = 0; j < row.length(); j++) {
                char c = row.charAt(j);
                switch (c) {
                    case 'A':
                    case 'T':
                    case 'C':
                    case 'G':
                        break; // Caracter válido
                    default:
                        throw new Exception("Caracter inválido en posición (" + i + "," + j + "): " + c);
                }
            }
        }
    }
}
