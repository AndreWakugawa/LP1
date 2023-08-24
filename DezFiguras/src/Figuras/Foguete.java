/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author André
 */
public class Foguete {
    private final String nome;
    private boolean pousado;
    private final String paisOrigem;
    private String localAtual;
    private int velocidade;
    private boolean desacoplado;
    private double combustivelQtd;

    public String getNome() {
        return nome;
    }

    public boolean isPousado() {
        return pousado;
    }

    public void setPousado(boolean pousado) {
        this.pousado = pousado;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public String getLocalAtual() {
        return localAtual;
    }

    public void setLocalAtual(String localAtual) {
        this.localAtual = localAtual;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public boolean isDesacoplado() {
        return desacoplado;
    }

    public void setDesacoplado(boolean desacoplado) {
        this.desacoplado = desacoplado;
    }

    public double getCombustivelQtd() {
        return combustivelQtd;
    }

    public void setCombustivelQtd(double combustivelQtd) {
        this.combustivelQtd = combustivelQtd;
    }
    
    public Foguete(String nome, boolean pousado, String paisOrigem, String localAtual, int velocidade, boolean desacoplado, double combustivelQtd) {
        this.nome = nome;
        this.pousado = pousado;
        this.paisOrigem = paisOrigem;
        this.localAtual = localAtual;
        this.velocidade = velocidade;
        this.desacoplado = desacoplado;
        this.combustivelQtd = combustivelQtd;
    }
    
    public void pousar() {
        if (!pousado) {
            this.velocidade = 0;
            pousado = true;
            System.out.println("O foguete pousou");
        } else {
            System.out.println("O foguete já está pousado");
        }
    }
    
    public void desacoplar() {
        if (!desacoplado) {
            desacoplado = true;
            System.out.println("O foguete desacoplou");
        } else {
            System.out.println("O foguete já está desacoplado");
        }
    }
    
    public void retornarTerra() {
        if (combustivelQtd > 0) {
            System.out.println("Foguete retornando à Terra");
        } else {
            System.out.println("Foguete não pode voltar à Terra");
        }
    }
}
