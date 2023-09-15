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
public class Ex81 {
    public static void ex81Vet() {
        int Q[] = new int[20];
        Random rng = new Random();
        for (int i = 0; i < Q.length; i++) {
            Q[i] = rng.nextInt(101);
        }
        System.out.println(Arrays.toString(Q));
        
        int menor = 100;
        int menorPosicao = 0;
        for (int i = 0; i < Q.length; i++) {
            if (Q[i] < menor) {
                menor = Q[i];
                menorPosicao = i+1;
            }
        }
        System.out.println("O maior valor de Q é: " + menor + " na posição " + menorPosicao);
    }
    
    public static void ex81List() {
        ArrayList<Integer> Q = new ArrayList<>();
        Random rng = new Random();
        for (int i = 0; i < 20; i++) {
            Q.add(rng.nextInt(101));
        }
        System.out.println(Q.toString());
        
        int menor = 100;
        int menorPosicao = 0;
        for (int i = 0; i < Q.size(); i++) {
            if (Q.get(i) < menor) {
                menor = Q.get(i);
                menorPosicao = i+1;
            }
        }
        System.out.println("O maior valor de Q é: " + menor + " na posição " + menorPosicao);
        
    }
}
