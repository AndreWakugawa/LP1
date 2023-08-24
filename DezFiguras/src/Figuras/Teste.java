/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author André
 */
public class Teste {
    public static void main(String[] args) {
        Aviao av1 = new Aviao(0, "brazil", "usa", "white");
        Bicicleta bici1 = new Bicicleta(true, true, 26);
        Carro carro1 = new Carro(false, "toyota", 3);
        Foguete fog1 = new Foguete("Chandrayaan-3", true, "india", "moon", 0, true, 0);
        Moto moto1 = new Moto(true, "red", 100);
        NaveEspacial naveEsp1 = new NaveEspacial("Millennium Falcon", false, 1200, "Han Solo", true);
        Navio navio1 = new Navio("titanic", "transatlantico", false, true);
        Onibus onib1 = new Onibus(0, 40, 1970, 30);
        Submarino sub1 = new Submarino("militar", 0, -20);
        Trem trem1 = new Trem("carga", "diesel", 160);
        
        av1.exportar("nigeria");
        bici1.subirRampa();
        carro1.quebrar();
        fog1.retornarTerra();
        moto1.derrapar(true);
        naveEsp1.alterarProprietario("Rey Skywalker");
        navio1.navegar();
        onib1.lotar(20);
        sub1.emergir(30);
        trem1.passear();
    }
}
