/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author André
 */
public class Navio {
    private final String nome;
    private final String tipo;
    private boolean ancorado;
    private boolean afundado;

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }
    
    public boolean isAncorado() {
        return ancorado;
    }

    public void setAncorado(boolean ancorado) {
        this.ancorado = ancorado;
    }

    public boolean isAfundado() {
        return afundado;
    }

    public void setAfundado(boolean afundado) {
        this.afundado = afundado;
    }

    public Navio(String nome, String tipo, boolean ancorado, boolean afundado) {
        this.nome = nome;
        this.tipo = tipo;
        this.ancorado = ancorado;
        this.afundado = afundado;
    }
    
    public void desancorar() {
        if (!ancorado) {
            ancorado = false;
            System.out.println("O navio desancorou");
        } else {
            System.out.println("O navio já está desancorado");
        }
    }
    
    public void atirar() {
        if ("militar".equals(tipo)) {
            System.out.println("O navio atirou");
        } else {
            System.out.println("Não é possível, o navio não é militar");
        }
    }
    
    public void navegar() {
        if (!afundado && !ancorado) {
            System.out.println("O navio está navegando");
        } else {
            System.out.println("O navio não pode navegar");
        }
    }
}
