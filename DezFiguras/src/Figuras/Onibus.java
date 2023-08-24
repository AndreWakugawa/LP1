/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Figuras;

import java.time.Year;

/**
 *
 * @author André
 */
public class Onibus {
    private int velocidade;
    private int capacidade;
    private int anoFabricacao;
    private int passageiros;

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }
    
    public int getPassageiros() {
        return passageiros;
    }
    
    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

    public Onibus(int velocidade, int capacidade, int anoFabricacao, int passageiros) {
        this.velocidade = velocidade;
        this.capacidade = capacidade;
        this.anoFabricacao = anoFabricacao;
    }
    
    public void estacionar() {
        if (velocidade != 0) {
            System.out.println("O ónibus está em movimento.");
        } else {
            System.out.println("O ônibus vai estacionar.");
        }
    }
    
    public void lotar(int novoPassageiro) {
        this.passageiros = this.passageiros +novoPassageiro;
        if (capacidade < passageiros) {
            System.out.println("O ônibus irá lotar com os novos passageiros.");
        } else {
            System.out.println("O ônibus não ira lotar.");
        }
    }
    
    public boolean descartar() {
        boolean obsoleto = false;
        
        if (Year.now().getValue() - anoFabricacao > 30) {
            obsoleto = true;
        }
        return obsoleto;
    }
}
