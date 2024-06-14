/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meu_carro_minha_vida;

/**
 *
 * @author lefae
 */
public class Dados { // classe para salvar dados que serão utilizados posteriormente no programa
    
    public static int idUser;
    public static String placaVeiculo;

    public static int getIdUser() {
        return idUser;
    }
    public static void setIdUser(int idUser) {
        Dados.idUser = idUser;
    }
    public static String getPlacaVeiculo() {
        return placaVeiculo;
    }
    public static void setPlacaVeiculo(String placaVeiculo) {
        Dados.placaVeiculo = placaVeiculo;
    }   
    
}
