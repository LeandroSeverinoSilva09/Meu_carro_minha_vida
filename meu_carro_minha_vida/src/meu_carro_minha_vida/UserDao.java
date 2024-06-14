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
import java.util.ArrayList;

public class UserDao {
    ConexaoBD conexao = ConexaoBD.getInstance();

    public void cadastarUsuario(String nome, int idade, String cidade, String login, String senha) {
        String sql = "INSERT INTO usuarios (nome, idade, cidade, login, senha) VALUES ('" + nome + "', " + idade + ", '"
                + cidade + "', '" + login + "', '" + senha + "');";
        conexao.executarSQL(sql);

    }

    public boolean login(String login, String senha) throws SQLException {
        String sql = "SELECT login, senha FROM usuarios WHERE login = '" + login + "' and senha = '" + senha + "';";
        ResultSet resultado = null;
        resultado = conexao.executarConsulta(sql);
        if (resultado.next()) {
            return true;
        } else {
            return false;
        }

    }

    public ArrayList<String> dadosUsuario(String login) {
        String sql = "SELECT nome, idade, cidade FROM usuarios WHERE login = '" + login + "';";
        ResultSet result = null;
        result = conexao.executarConsulta(sql);

        String nome = "";
        int idade = 0;
        String cidade = "";

        try {
            nome = result.getString("nome");
            idade = result.getInt("idade");
            cidade = result.getString("cidade");
        } catch (Exception e) {
            System.out.println("Erro" + e.getMessage());
        }

        ArrayList<String> resultado = new ArrayList<>();
        resultado.add(nome);
        resultado.add(Integer.toString(idade));
        resultado.add(cidade);

        return resultado;
    }
}
