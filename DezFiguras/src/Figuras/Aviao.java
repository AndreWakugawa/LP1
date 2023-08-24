/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author André
 */
public class Aviao {
    private int velocidade;
    private final String paisOrigem;
    private String localAtual;
    private String cor;

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public String getLocalOrigem() {
        return paisOrigem;
    }

    public String getLocalAtual() {
        return localAtual;
    }

    public void setPaisAtual(String localAtual) {
        this.localAtual = localAtual;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Aviao(int velocidade, String paisOrigem, String localAtual, String cor) {
        this.velocidade = velocidade;
        this.paisOrigem = paisOrigem;
        this.localAtual = localAtual;
        this.cor = cor;
    }
    
    public boolean ultrapassarSom () {
        return velocidade > 1234;
    }
    
    public String pintarAviao(String novaCor) {
        this.cor = novaCor;
        return this.cor;
    }
    
    public void exportar(String paisDestino) {
        this.localAtual = paisDestino;
        System.out.println("O avião foi exportado para " +localAtual);
    } 
}
