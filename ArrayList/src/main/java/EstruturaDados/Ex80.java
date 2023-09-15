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
public class Ex80 {
    public static void ex80Vet() {
        int Q[] = new int[20];
        Random rng = new Random();
        for (int i = 0; i < Q.length; i++) {
            Q[i] = rng.nextInt(101);
        }
        System.out.println(Arrays.toString(Q));
        
        int maior = 0;
        int maiorPosicao = 0;
        for (int i = 0; i < Q.length; i++) {
            if (Q[i] > maior) {
                maior = Q[i];
                maiorPosicao = i+1;
            }
        }
        System.out.println("O maior valor de Q é: " + maior + " na posição " + maiorPosicao);
    }
    
    public static void ex80List() {
        ArrayList<Integer> Q = new ArrayList<>();
        Random rng = new Random();
        for (int i = 0; i < 20; i++) {
            Q.add(rng.nextInt(101));
        }
        System.out.println(Q.toString());
        
        int maior = 0;
        int maiorPosicao = 0;
        for (int i = 0; i < Q.size(); i++) {
            if (Q.get(i) > maior) {
                maior = Q.get(i);
                maiorPosicao = i+1;
            }
        }
        System.out.println("O maior valor de Q é: " + maior + " na posição " + maiorPosicao);
        
    }
}
