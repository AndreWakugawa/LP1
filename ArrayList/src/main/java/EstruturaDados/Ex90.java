/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstruturaDados;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
/**
 *
 * @author André
 */
public class Ex90 {
    public static void ex90Vet() {
        Random rng = new Random();
        int[] lista = new int[30];
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < lista.length; i++) {
            lista[i] = rng.nextInt(30) + 1;
        }
        
        System.out.println("Lista: " + Arrays.toString(lista));
        System.out.println("Digite um número para buscar na lista");
        int numero = sc.nextInt();
        int numeroCount = 0;
        
        for (int i = 0; i < lista.length; i++) {
            if (numero == lista[i]) {
                numeroCount++;
            }
        }
        System.out.println("O número " + numero + " aparece " + numeroCount + " vezes na lista");
    }
    
    public static void ex90List() {
        Random rng = new Random();
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        while (lista.size() < 30) {
            lista.add(rng.nextInt(30) + 1);
        }
        
        System.out.println("Lista: " + lista.toString());
        System.out.println("Digite um número para buscar na lista");
        int numero = sc.nextInt();
        int numeroCount = 0;
        
        for (int i = 0; i < lista.size(); i++) {
            if (numero == lista.get(i)) {
                numeroCount++;
            }
        }
        System.out.println("O número " + numero + " aparece " + numeroCount + " vezes na lista");
    }
}
