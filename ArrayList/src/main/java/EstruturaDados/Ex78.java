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
public class Ex78 {
    public static void ex78Vet() {
        String nomes[] = new String[10];
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(String.format("Digite o %d nome:", i+1));
            String nomesInput = sc.next();
            nomes[i] = nomesInput; 
        }
        
        boolean found = false;
        
        System.out.println("Procure um nome na lista:");
        String nomeBusca = sc.next();
        for (String n : nomes) {
            if (nomeBusca.equals(n)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("ACHEI");
        } else {
            System.out.println("NAO ACHEI");
        }
    }
    
    public static void ext78List() {
        ArrayList<String> nomes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++) {        
        System.out.println(String.format("Digite o %d nome", i+1));
        String nomesInput = sc.next();
        nomes.add(nomesInput);
        }
        
        boolean found = false;
        
        System.out.println("Procure um nome na lista:");
        String nomeBusca = sc.next();
        for (String n : nomes) {
            if (nomeBusca.equals(n)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("ACHEI");
        } else {
            System.out.println("NAO ACHEI");
        }
    }
}
