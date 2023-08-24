/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author André
 */
public class Trem {
    private String transporte;
    private String fonteEnergia;
    private int velocidade;

    public String getTransporte() {
        return transporte;
    }

    public void setTransporte(String transporte) {
        this.transporte = transporte;
    }

    public String getFonteEnergia() {
        return fonteEnergia;
    }

    public void setFonteEnergia(String fonteEnergia) {
        this.fonteEnergia = fonteEnergia;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public Trem(String transporte, String fonteEnergia, int velocidade) {
        this.transporte = transporte;
        this.fonteEnergia = fonteEnergia;
        this.velocidade = velocidade;
    }
    
    public void passear() {
        if ("pessoa".equals(transporte)) {
            System.out.println("É possível passear");
        } else {
            System.out.println("Transporte incompativel. Impossível passear");
        }
    }
    
    public void fretar() {
        if ("carga".equals(transporte)) {
            System.out.println("É possível fretar");
        } else {
            System.out.println("Transporte incompativel. Impossível fretar");
        }
    }
        
    public boolean poluir() {
        return "diesel".equals(fonteEnergia);
    }
}
