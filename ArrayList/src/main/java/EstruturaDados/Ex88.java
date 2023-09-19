/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstruturaDados;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author André
 */
public class Ex88 {
    public static void ex88Vet() {
        Random rng = new Random();
        int[] lista = rng.ints(1, 51).distinct().limit(20).toArray();
        System.out.println("Lista: " + Arrays.toString(lista));
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para verificar na lista: ");
        int numero = sc.nextInt();
        
        int[] novaLista = new int[19];
        int novaListaIndex = 0;
        boolean encontrado = false;
        
        for (int numeros:lista) {
            if (numero == numeros) {
                encontrado = true;
            }
        }
        
        if (encontrado) {
            for (int i = 0; i < lista.length; i++) {
                if (lista[i] != numero) {
                    novaLista[novaListaIndex] = lista[i];
                    novaListaIndex++;
                }
            }
            System.out.println("Nova Lista: " + Arrays.toString(novaLista));
        } else {
            System.out.println("O número não está na lista");
        }
    }
    
    public static void ex88List() {
        Random rng = new Random();
        ArrayList<Integer> lista = new ArrayList<>();
        while (lista.size() < 20) {
            int numero = rng.nextInt(50) + 1;
            if (!lista.contains(numero)) {
                lista.add(numero);
            }
        }
        System.out.println("Lista: " + lista.toString());
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para verificar na lista: ");
        int numero = sc.nextInt();
        
        ArrayList<Integer> novaLista = new ArrayList<>();
        int novaListaIndex = 0;
        boolean encontrado = false;
        
        for (int numeros:lista) {
            if (numero == numeros) {
                encontrado = true;
            }
        }
        
        if (encontrado) {
            for (int i = 0; i < lista.size(); i++) {
                if (numero != lista.get(i)) {
                    novaLista.add(lista.get(i));
                }
            }
            System.out.println("Nova Lista " + novaLista.toString());
        } else {
            System.out.println("O número não está na lista");
        }
    }
}
