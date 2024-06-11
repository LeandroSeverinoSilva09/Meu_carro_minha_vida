/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meu_carro_minha_vida;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Pedro
 */

public class CarroDao {
    ConexaoBD conexao = ConexaoBD.getInstance();

    public void cadastroCarro(String marca, String modelo, int kmRodado, float valorFipe, int ano, String placa) {
        String sql = "INSERT INTO veiculo (marca, modelo, km_rodado, valor_fipe, ano_veiculo, placa) VALUES ('" + marca
                + "', '" + modelo + "', '" + kmRodado + "', '" + valorFipe + "', '" + ano + "', '" + placa + "');";
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

}