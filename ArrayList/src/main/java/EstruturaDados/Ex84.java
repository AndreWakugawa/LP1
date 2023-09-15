/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstruturaDados;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author André
 */
public class Ex84 {
    public static void ex84Vet() {
        Scanner sc = new Scanner(System.in);
        Random rng = new Random();
        System.out.println("Digite o tamanho da lista");
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        int[] soma = new int[N];
        
        for (int i = 0; i < A.length; i++) {
            A[i] = rng.nextInt(51);
            B[i] = rng.nextInt(51);
            soma[i] = A[i] + B[i];
        }
        System.out.println("vetor A: "+ Arrays.toString(A));
        System.out.println("vetor B: " + Arrays.toString(B));    
        System.out.println("vetor soma:" + Arrays.toString(soma));
    }
    
    public static void ex84List() {
        Scanner sc = new Scanner(System.in);
        Random rng = new Random();
        System.out.println("Digite o tamanho da lista");
        int N = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        ArrayList<Integer> soma = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            A.add(rng.nextInt(51));
            B.add(rng.nextInt(51));
            soma.add(A.get(i) + B.get(i));
        }
        System.out.println("vetor A: "+ A.toString());
        System.out.println("vetor B: " + B.toString());
        System.out.println("vetor soma:" + soma.toString());
    }
}
