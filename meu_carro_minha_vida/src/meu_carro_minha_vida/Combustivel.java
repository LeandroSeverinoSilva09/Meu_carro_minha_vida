/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meu_carro_minha_vida;


/**
 *
 * @author Vinicius
 */
public class Combustivel {
    private double valorAlcool;
    private double valorGasolina;
    private double resultado;
    private double quantidadeAbastecida;
    private double distanciaPercorrida;
    
    public double getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public void setDistanciaPercorrida(double distanciaPercorrida) {
        this.distanciaPercorrida = distanciaPercorrida;
    }

    public double getQuantidadeAbastecida() {
        return quantidadeAbastecida;
    }

    public void setQuantidadeAbastecida(double quantidadeAbastecida) {
        this.quantidadeAbastecida = quantidadeAbastecida;
    }

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

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }


    public double CalcularAutonomia(){
        double autonomia = distanciaPercorrida / quantidadeAbastecida;
        return autonomia;
    }

    public String ViabilidadeEconomica(){
        double relacao = getValorAlcool()/getValorGasolina();

        if (relacao <= 0.70) {
            return "ALCOOL";
        } else if (relacao > 0.70){
            return "GASOLINA";
        }
        else{
            return "ERRO";
        }
    }

    
}
/*      double autonomia = CalcularAutonomia();
        double custoPorKmGasolina = getValorGasolina() / autonomia;
        double custoPorKmAlcool = getValorAlcool() / autonomia;

        System.out.println("Custo por km com gasolina: R$ " + custoPorKmGasolina);
        System.out.println("Custo por km com alcool: R$ " + custoPorKmAlcool);
 */

