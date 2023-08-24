/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author André
 */
public class Carro {
    private final boolean motorizado;
    private final String marca;
    private int rodas;

    public boolean isMotorizado() {
        return motorizado;
    }

    public String getMarca() {
        return marca;
    }

    public int getRodas() {
        return rodas;
    }

    public Carro(boolean motorizado, String marca, int rodas) {
        this.motorizado = motorizado;
        this.marca = marca;
        this.rodas = rodas;
    }
    
    public void andar() {
        if (motorizado) {
            System.out.println("Seu carro vai andar, ele tem motor");
        } else {
            System.out.println("Seu carro não vai andar, ele não tem motor");
        }
    }
    
    public void quebrar() {
        if (rodas <4) {
            System.out.println("Seu carro vai quebrar pois não tem 4 rodas");
        }
    }
    
    public boolean capotar () {
        return true;
    }
    
    
}
