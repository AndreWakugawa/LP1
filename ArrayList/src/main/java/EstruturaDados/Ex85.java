/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstruturaDados;
import java.util.Random;
import java.util.ArrayList;
/**
 *
 * @author André
 */
public class Ex85 {
    public static void ex85Vet() {
        Random rng = new Random();
        double tempMin = 0;
        double tempMax = 40;
        double menor = 100;
        double maior = 0;
        double soma = 0;
        double[] temp = new double[365];
        
        for (int i = 0; i < temp.length; i++) {
            temp[i] = rng.nextDouble(tempMax - tempMin) + tempMin;
            if (temp[i] < menor) {
                menor = temp[i];
            }
            if (temp[i] > maior) {
                maior = temp[i];
            }
            soma+= temp[i];
        }
        
        double media = soma/365;
        int inferiorMedia = 0;
        
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] < media) {
                inferiorMedia++;
            }
        }
        System.out.println("Menor temperatura: " + menor);
        System.out.println("Maior temperatura: " + maior);
        System.out.println("Temperatura media: " + media);
        System.out.println("#Dias abaixo da media: " + inferiorMedia);
    }
    
    public static void ex85List() {
        Random rng = new Random();
        double tempMin = 0;
        double tempMax = 40;
        double menor = 100;
        double maior = 0;
        double soma = 0;
        ArrayList<Double> temp = new ArrayList<>();
        
        for (int i = 0; i < 365; i++) {
            temp.add(rng.nextDouble(tempMax - tempMin) + tempMin);
            if (temp.get(i) < menor) {
                menor = temp.get(i);
            }
            if (temp.get(i)> maior) {
                maior = temp.get(i);
            }
            soma+= temp.get(i);
        }
        
        double media = soma/365;
        int inferiorMedia = 0;
        
        for (int i = 0; i < temp.size(); i++) {
            if (temp.get(i) < media) {
                inferiorMedia++;
            }
        }
        System.out.println("Menor temperatura: " + menor);
        System.out.println("Maior temperatura: " + maior);
        System.out.println("Temperatura media: " + media);
        System.out.println("#Dias abaixo da media: " + inferiorMedia);
    }
}
