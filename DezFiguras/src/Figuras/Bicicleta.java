/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author André
 */
public class Bicicleta {
    private boolean cesta;
    private boolean marcha;
    private double aro;

    public boolean isCesta() {
        return cesta;
    }

    public void setCesta(boolean cesta) {
        this.cesta = cesta;
    }

    public boolean isMarcha() {
        return marcha;
    }

    public double getAro() {
        return aro;
    }

    public Bicicleta(boolean cesta, boolean marcha, double aro) {
        this.cesta = cesta;
        this.marcha = marcha;
        this.aro = aro;
    }
    
    public void subirRampa() {
        if (marcha) {
            System.out.println("A bicicleta consegue subir pois tem marcha");
        } else {
            System.out.println("A bicicleta não sobe pois não tem marcha");
        }
    }
    
    public boolean frear() {
        return true;
    }
    
    public void instalarCesta() {
        if (cesta) {
            System.out.println("A bicicleta já tem cesta");
        } else {
            this.cesta = true;
            System.out.println("A cesta foi instalada na bicicleta");
        }
    }
}
