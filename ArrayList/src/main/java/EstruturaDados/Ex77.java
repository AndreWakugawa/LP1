/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstruturaDados;
import java.util.Arrays;
import java.util.ArrayList;
/**
 *
 * @author André
 */
public class Ex77 {
    public static void ex77Vet() {
        int v[] = {5,1,4,2,7,8,3,6};
        for (int i=7; i>=4; i--) {
            int aux = v[i];
            v[i] = v[7-i+1];
            v[7-i+1] = aux;
        }
        v[2] = v[0];
        v[v[2]] = v[v[1]];
        
        System.out.println(Arrays.toString(v));
    }
    
    public static void ex77List() {
        ArrayList<Integer> v = new ArrayList<Integer>();
        v.addAll(Arrays.asList(5,1,4,2,7,8,3,6));
        for (int i=7; i>=4; i--) {
            int aux = v.get(i);
            v.set(i, v.get(7-i+1));
            v.set(v.get(7-i+1), aux);            
        }
        v.set(2, v.get(0));
        v.set(v.get(2), v.get(v.get(1)));
        
        System.out.println(v.toString());
        
    }
}
