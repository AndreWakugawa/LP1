/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author André
 */
public class Moto {
    private final boolean motorizado;
    private String cor;
    private double velocidade;

    public boolean isMotorizado() {
        return motorizado;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public Moto(boolean motorizado, String cor, double velocidade) {
        this.motorizado = motorizado;
        this.cor = cor;
        this.velocidade = velocidade;
    }
    
    public double aumentarVelocidade (int aumento) {
        this.velocidade = this.velocidade + aumento;
        return this.velocidade;
    }
    
    public String pintarMoto (String novaCor) {
        this.cor = novaCor;
        return this.cor;
    }
    
    public void derrapar (boolean curva) {
        if (velocidade > 80 && curva) {
            System.out.println("A moto vai derrapar");
        } else {
            System.out.println("A moto não vai derrapar");
        }
    }
}
