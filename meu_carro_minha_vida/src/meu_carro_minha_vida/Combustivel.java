/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meu_carro_minha_vida;

/**
 * Essa classe realiza calculos relacionados ao combustivél
 * 
 * @author Vinicius
 * @author Leandro
 */
public class Combustivel {
    private double valorAlcool;
    private double valorGasolina;

    public double getValorAlcool() {
        return valorAlcool;
    }

    public void setValorAlcool(double valorAlcool) {
        this.valorAlcool = valorAlcool;
    }

    public double getValorGasolina() {
        return valorGasolina;
    }

    public void setValorGasolina(double valorGasolina) {
        this.valorGasolina = valorGasolina;
    }

    public String ViabilidadeEconomica() {
        double relacao = getValorAlcool() / getValorGasolina();

        if (relacao <= 0.70) {
            return "Está valendo mais apena abastecer com ALCOOL.";
        } else if (relacao > 0.70) {
            return "Está valendo mais apena abastecer com GASOLINA.";
        } else {
            return "ERRO";
        }
    }

}
