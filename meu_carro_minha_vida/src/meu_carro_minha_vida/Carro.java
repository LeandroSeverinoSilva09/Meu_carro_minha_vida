/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meu_carro_minha_vida;

/**
 *
 * @author Pedro
 */
public class Carro {
    private String marca;
    private String modelo;
    private int kmRodado;
    private float valorFipe;
    private int anodoveiculo;
    private String placa;

    public Carro(String marca, String modelo, int kmRodado, float valorFipe, int anodoveiculo, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.kmRodado = kmRodado;
        this.valorFipe = valorFipe;
        this.anodoveiculo = anodoveiculo;
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKmRodado() {
        return kmRodado;
    }

    public void setKmRodado(int kmRodado) {
        this.kmRodado = kmRodado;
    }

    public float getValorFipe() {
        return valorFipe;
    }

    public void setValorFipe(float valorFipe) {
        this.valorFipe = valorFipe;
    }

    public int getAnodoveiculo() {
        return anodoveiculo;
    }

    public void setAnodoveiculo(int anodoveiculo) {
        this.anodoveiculo = anodoveiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

}
