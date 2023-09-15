/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstruturaDados;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author André
 */
public class Ex82 {
    public static void ex82Vet() {
        int[] A = new int[10];
        int[] M = new int[10];
        Scanner sc = new Scanner(System.in);
        Random rng = new Random();
        System.out.println("Insira um valor para X:");
        int X = sc.nextInt();
        
        for (int i = 0; i < A.length; i++) {
            A[i] = rng.nextInt(21);
            M[i] = A[i] * X;
        }
        System.out.println("vetor A:" + Arrays.toString(A));
        System.out.println("vetor M:" + Arrays.toString(M));
    }
    
    public static void ex82List() {
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> M = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Random rng = new Random();
        System.out.println("Insira um valor para X:");
        int X = sc.nextInt();
        
        for (int i = 0; i < 10; i++) {
            A.add(rng.nextInt(21));
            M.add(A.get(i) * X);
        }
        System.out.println("vetor A:" + A.toString());
        System.out.println("vetor M:" + M.toString());
    }
}
