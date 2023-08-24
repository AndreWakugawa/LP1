/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author André
 */
public class NaveEspacial {
    private String nome;
    private boolean real;
    private int velocidadeMaxima;
    private String proprietario;
    private boolean pousado;
    
    public String getNome() {
        return nome;
    }

    public void setNome() {
        this.nome = nome;
    }
    
    public boolean isReal() {
        return real;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public boolean isPousado() {
        return pousado;
    }

    public void setPousado(boolean pousado) {
        this.pousado = pousado;
    }

    public NaveEspacial(String nome, boolean real, int velocidadeMaxima, String proprietario, boolean pousado) {
        this.real = real;
        this.velocidadeMaxima = velocidadeMaxima;
        this.proprietario = proprietario;
    }
    
    public void alterarProprietario(String novoProprietario) {
        this.proprietario = novoProprietario;
        System.out.println("O novo proprietário da nave é " +proprietario);
    }
    
    public boolean ultrapassarSom () {
        if (velocidadeMaxima > 1234) {
            return true;
        } else {
            return false;
        }
    }
    
    public void decolar() {
        if (!pousado) {
            System.out.println("A nave já está no ar");
        } else {
            pousado = true;
            System.out.println("A nave decolou");
        }
    }
}
