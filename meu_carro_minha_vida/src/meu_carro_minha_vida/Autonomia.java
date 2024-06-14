/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meu_carro_minha_vida;

/**
 *
 * @author Vinicius
 */
public class Autonomia {

    private double litrosAbastecidos;
    private int kmRodado;
    private int kmDia;
    private double valorCombustivél;

    public double getLitrosAbastecidos() {
        return litrosAbastecidos;
    }

    public void setLitrosAbastecidos(double litrosAbastecidos) {
        this.litrosAbastecidos = litrosAbastecidos;
    }

    public int getKmRodado() {
        return kmRodado;
    }

    public void setKmRodado(int kmRodado) {
        this.kmRodado = kmRodado;
    }

    public int getKmDia() {
        return kmDia;
    }

    public void setKmDia(int kmDia) {
        this.kmDia = kmDia;
    }

    public double getValorCombustivél() {
        return valorCombustivél;
    }

    public void setValorCombustivél(double valorCombustivél) {
        this.valorCombustivél = valorCombustivél;
    }

    public double calcularAutonomia() {
        double autonomia = 0;
        autonomia = getKmRodado() / getLitrosAbastecidos();
        return autonomia;
    }

    public double valorMensal() {
        double valorMensal = 0;
        double gastoLtrsDia = getKmDia() / calcularAutonomia(); // obtenho quantos litros eu gassto por dia
        valorMensal = gastoLtrsDia * valorCombustivél; // obtenho o valor gasto por dia
        valorMensal = valorMensal * 30; // obtenho o valor gasto por mes
        return valorMensal;
    }

    public double valorAnual() {
        double valorAnual = 0;
        valorAnual = valorMensal() * 12;
        return valorAnual;
    }

    public double kmMensal() {
        double kmMensal = 0;
        kmMensal = getKmDia() * 30;
        return kmMensal;
    }
}
