/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meu_carro_minha_vida;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Pedro
 */

public class CarroDao {
    ConexaoBD conexao = ConexaoBD.getInstance();

    public void cadastroCarro(String marca, String modelo, int kmRodado, float valorFipe, int ano, String placa) {
        String sql = "INSERT INTO veiculo (marca, modelo, km_rodado, valor_fipe, ano_veiculo, placa, id_user) VALUES ('" + marca
                + "', '" + modelo + "', '" + kmRodado + "', '" + valorFipe + "', '" + ano + "', '" + placa + "', '"+Dados.getIdUser()+"');";
        conexao.executarSQL(sql);

    }

    public boolean verificarplaca(String placa) throws SQLException {
        String sql = "SELECT placa FROM veiculo WHERE placa = '" + placa + "';";
        ResultSet resultado = null;
        resultado = conexao.executarConsulta(sql);
        if (resultado.next()) {
            return true;
        } else {
            return false;
        }

    }

    public ArrayList<String> dadosVeiculo(String placa) {
        String sql = "SELECT marca, modelo, km_rodado, valor_fipe, ano_veiculo, placa FROM veiculo WHERE placa = '"
                + placa + "';";
        ResultSet result = null;

        String marca = "";
        String modelo = "";
        int km_rodado = 0;
        int valorFipe = 0;
        int ano = 0;
        String placaBD = "";

        try{
            result = conexao.executarConsulta(sql);
            if (result.next()){
                try {
                    marca = result.getString("marca");
                    modelo = result.getString("modelo");
                    km_rodado = result.getInt("km_rodado");
                    valorFipe = result.getInt("valor_fipe");
                    ano = result.getInt("ano_veiculo");
                    placaBD = result.getString("placa");
                } catch (Exception e) {
                    System.out.println("Erro" + e.getMessage());
                }
            }
        } catch (Exception e ){
            System.out.println("Erro " + e.getMessage());
        }

        ArrayList<String> resultado = new ArrayList<>();
        resultado.add(marca);
        resultado.add(modelo);
        resultado.add(Integer.toString(km_rodado));
        resultado.add(Integer.toString(valorFipe));
        resultado.add(Integer.toString(ano));
        resultado.add(placaBD);

        return resultado;
    }

}