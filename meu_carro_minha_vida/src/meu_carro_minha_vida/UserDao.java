/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meu_carro_minha_vida;

/**
 *
 * @author leandro
 */

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
    
    public void cadastarUsuario(String nome, int idade, String cidade, String login, String senha) {
        ConexaoBD conexao = ConexaoBD.getInstance();
        String sql = "INSERT INTO usuarios (nome, idade, cidade, login, senha) VALUES ('" + nome + "', " + idade + ", '"
                + cidade + "', '" + login + "', '" + senha + "');";
        conexao.executarSQL(sql);
        conexao.closeConDB();

    }

    public boolean login(String login, String senha) throws SQLException {
        ConexaoBD conexao = ConexaoBD.getInstance();
        String sql = "SELECT login, senha FROM usuarios WHERE login = '" + login + "' and senha = '" + senha + "';";
        ResultSet resultado = null;
        resultado = conexao.executarConsulta(sql);
        if (resultado.next()) {
            conexao.closeConDB();
            return true;
        } else {
            conexao.closeConDB();
            return false;
        }

    }

    public ResultSet dadosUsuario(String login){
        ConexaoBD conexao = ConexaoBD.getInstance();
        String sql = "SELECT * FROM usuarios WHERE login = '"+login+"';";
        ResultSet resultado = null;
        resultado = conexao.executarConsulta(sql);
        conexao.closeConDB();
        return resultado;
    }
}
