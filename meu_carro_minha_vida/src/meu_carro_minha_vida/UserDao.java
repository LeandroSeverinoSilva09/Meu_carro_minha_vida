package meu_carro_minha_vida;

public class UserDao {
    ConexaoBD conexao = ConexaoBD.getInstance();

    public void cadastarUsuario(String nome, int idade, String cidade, String login, String senha) {
        String sql = "INSERT INTO usuarios (nome, idade, cidade, login, senha) VALUES ('" + nome + "', " + idade + ", '"
                + cidade + "', '" + login + "', '" + senha + "');";
        conexao.executarSQL(sql);
        conexao.closeConDB();

    }

}
