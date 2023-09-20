/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstruturaDados;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author André
 */
public class Ex79 {
    public static void ex79Vet() {
        double notas[] = new double[20];
        Scanner sc = new Scanner(System.in);
        
        
        for (int i = 0; i < notas.length; i++) {
            System.out.println(String.format("Digite a %d nota:", i+1));
            double notasInput = sc.nextDouble();
            notas[i] = notasInput; 
        }
        
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        
        double media = soma / notas.length;
        int acimaMedia = 0;
        
        for (double nota : notas) {
            if (nota > media) {
                acimaMedia++;
            }
        }
        
        System.out.println("A média da turma foi de: " + media +" e " + acimaMedia +" alunos ficaram acima da média");
    }
    
    public static void ex79List() {
        ArrayList<Double> notas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        

        
        for (int i = 0; i < 20; i++) {
            System.out.println(String.format("Digite a %d nota:", i+1));
            double notasInput = sc.nextDouble();
            notas.add(notasInput);
        }
        
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        
        double media = soma / notas.size();
        int acimaMedia = 0;
        
        for (double nota : notas) {
            if (nota > media) {
                acimaMedia++;
            }
        }
        
        System.out.println("A média da turma foi de: " + media +" e " + acimaMedia +" alunos ficaram acima da média");
    }
}
