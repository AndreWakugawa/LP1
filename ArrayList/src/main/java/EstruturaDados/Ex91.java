/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstruturaDados;

import java.util.Random;
import java.util.Arrays;
/**
 *
 * @author André
 */
public class Ex91 {
    public static void ex91Vet() {
        Random rng = new Random();
        int[] vet = new int[50];
        
        for (int i = 0; i < vet.length; i++) {
            vet[i] = rng.nextInt(50) + 1;
        }
        
        System.out.println("Lista: " + Arrays.toString(vet));
        boolean repeat = false;
        boolean[] posRepetidas = new boolean[50];
        int numerosRepetidos = 0;
        
        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < i; j++) {
                if (vet[i] == vet[j]) {
                    posRepetidas[i] = true;
                    numerosRepetidos++;
                    break;
                }
            }
        }
        
        if (numerosRepetidos > 0) {
            System.out.println("Números repetidos e suas posições");
            for (int i = 0; i < vet.length; i++) {
                if (posRepetidas[i]) {
                    System.out.println("Número: " + vet[i] + ", Posição: " + (i + 1));
                }
                
            }
        } else {
            System.out.println("Não há números repetidos.");
        }
    }
}
