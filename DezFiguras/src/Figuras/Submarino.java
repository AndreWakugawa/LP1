/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author André
 */
public class Submarino {
    private String tipo;
    private double combustivelQtd;
    private int profundidade;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCombustivelQtd() {
        return combustivelQtd;
    }

    public void setCombustivelQtd(double combustivelQtd) {
        this.combustivelQtd = combustivelQtd;
    }

    public int getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(int profundidade) {
        this.profundidade = profundidade;
    }

    public Submarino(String tipo, double combustivelQtd, int profundidade) {
        this.tipo = tipo;
        this.combustivelQtd = combustivelQtd;
        this.profundidade = profundidade;
    }
    
    public void submergir (int descer) {
        if (profundidade < 0) {
            System.out.println("O submarino já está submergido");
        } else {
            this.profundidade = this.profundidade -descer;
            System.out.println("O submarino submergiu para" +profundidade + " metros");
        }
    }
    
    public void emergir (int subir) {
        if (profundidade >=0) {
            System.out.println("O submarino já está emergido");
        } else {
            this.profundidade = this.profundidade +subir;
            if (profundidade >0) {
                profundidade = 0;
            }
            System.out.println("O submarino subiu para o nível do mar");
        }
    }
    
    public void reabastecer (double combustivelAdic) {
        this.combustivelQtd = this.combustivelQtd +combustivelAdic;
        System.out.println("O submarino foi reabastecido com " +combustivelAdic + " litros");
    }
}
