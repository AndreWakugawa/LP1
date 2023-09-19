/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstruturaDados;

import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
/**
 *
 * @author André
 */
public class Ex89 {
    public static void ex89Vet() {
        Random rng = new Random();
        int[] v1 = new int[15];
        int[] v2 = new int[15];
        
        for (int i = 0; i < v1.length; i++) {
            int numv1 = rng.nextInt(20) + 1;
            int numv2 = rng.nextInt(20) + 1;
            v1[i] = numv1;
            v2[i] = numv2;            
        }
        
        System.out.println("Vetor 1: " + Arrays.toString(v1));
        System.out.println("Vetor 2: " + Arrays.toString(v2));
        
        int igualValorPosicao = 0;
        
        for (int i = 0; i < v1.length; i++) {
            if (v1[i] == v2[i]) {
                igualValorPosicao++;
            }
        }
        System.out.println("Quantidade de vezes que V1 e V2 têm mesmos números nas mesmas posições:" + igualValorPosicao);
    }
    
    public static void ex89List() {
        Random rng = new Random();
        ArrayList<Integer> v1 = new ArrayList<>();
        ArrayList<Integer> v2 = new ArrayList<>();
        
        while (v1.size() < 15){
            int numv1 = rng.nextInt(20) + 1;
            int numv2 = rng.nextInt(20) + 1;
            v1.add(numv1);
            v2.add(numv2);
        }
        
        System.out.println("Vetor 1: " + v1.toString());
        System.out.println("Vetor 2: " + v2.toString());
        int igualValorPosicao = 0;
        
        for (int i = 0; i < v1.size(); i++) {
            if (v1.get(i) == v2.get(i)) {
                igualValorPosicao++;
            }
        }
        System.out.println("Quantidade de vezes que V1 e V2 têm mesmos números nas mesmas posições:" + igualValorPosicao);
    }
}
