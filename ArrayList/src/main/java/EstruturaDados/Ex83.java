/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstruturaDados;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author André
 */
public class Ex83 {
    public static void ex83Vet() {
        int[] lista = new int[20];
        int[] listaInversa = new int[20];
        Random rng = new Random();
        
        int inversaInd = 19;
        for (int i = 0; i < lista.length; i++) {
            lista[i] = rng.nextInt(101);
            listaInversa[inversaInd - i] = lista[i];
        }
        System.out.println("vetor normal: " + Arrays.toString(lista));
        System.out.println("vetor inverso: " + Arrays.toString(listaInversa));
    }
    
    public static void ex83List() {
        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<Integer> listaInversa = new ArrayList<>();
        Random rng = new Random();
        
        int inversaInd = 19;
        for (int i = 0; i < 20; i++) {
            lista.add(rng.nextInt(101));
            listaInversa.add(0, lista.get(i));
        }
        System.out.println("vetor normal: " + lista.toString());
        System.out.println("vetor inverso: " + listaInversa.toString());
    }
}
