/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstruturaDados;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author André
 */
public class Ex87 {
    public static void ex87Vet() {
        Random rng = new Random();
        int[] vetor = new int[11];
        
        for (int i = 0; i < 10; i++) {
            vetor[i] = rng.nextInt(51);
        }
        System.out.println("Lista Inicial: " + Arrays.toString(vetor));
        
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 1; j < vetor.length-i; j++) {
                if (vetor[j-1] > vetor[j]) {
                    int aux = vetor[j-1];
                    vetor[j-1] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
        System.out.println("Lista Final: " + Arrays.toString(vetor));
        int numero = rng.nextInt(51);
        System.out.println("Adição de mais um valor: " + numero);

        for (int i = 0; i < vetor.length; i++) {
            for (int j = 1; j < vetor.length-i; j++) {
                if (vetor[j-1] == 0) {
                    vetor[j-1] = numero;
                }
                if (vetor[j-1] > vetor[j]) {
                    int aux = vetor[j-1];
                    vetor[j-1] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
        System.out.println("Lista Final com mais um valor:" + Arrays.toString(vetor));
    }
    
    public static void ex87List() {
        Random rng = new Random();
        java.util.ArrayList<Integer> vetor = new java.util.ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            vetor.add(rng.nextInt(51));
        }
        System.out.println("Lista Inicial: " + vetor.toString());
        
        for (int i = 0; i < vetor.size(); i++) {
            for (int j = 1; j < vetor.size()-i; j++) {
                if (vetor.get(j-1) > vetor.get(j)) {
                    int aux = vetor.get(j-1);
                    vetor.set(j-1, vetor.get(j));
                    vetor.set(j, aux);
                }
            }
        }
        System.out.println("Lista Final: " + vetor.toString());
        int numero = rng.nextInt(51);
        System.out.println("Adição de mais um valor: " + numero);
        vetor.add(numero);
        for (int i = 0; i < vetor.size(); i++) {
            for (int j = 1; j < vetor.size()-i; j++) {
                if (vetor.get(j-1) > vetor.get(j)) {
                    int aux = vetor.get(j-1);
                    vetor.set(j-1, vetor.get(j));
                    vetor.set(j, aux);
                }
            }
        }
        System.out.println("Lista Final com mais um valor:" + vetor.toString());
    }
}
